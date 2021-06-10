package com.app.jetpacksubmissionone.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.databinding.ItemFilmBinding
import com.app.jetpacksubmissionone.model.Film
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecyclerDataAdapter : RecyclerView.Adapter<RecyclerDataAdapter.DataAdapterViewHolder>() {

    private val listData = ArrayList<Film>()

    fun setListData(data: ArrayList<Film>, type: String) {
        EXTRA_TYPE = type
        listData.clear()
        listData.addAll(data)
        notifyDataSetChanged()
    }

    inner class DataAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemFilmBinding.bind(itemView)
        fun bindData(data: Film) {
            binding.idItemTitle.text = data.title
            binding.idItemRating.text = data.rating
            Glide.with(itemView).load(data.poto)
                .apply(RequestOptions())
                .override(150, 200)
                .into(binding.idItemPoto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapterViewHolder =
        DataAdapterViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_film, parent, false)
        )

    override fun onBindViewHolder(holder: DataAdapterViewHolder, position: Int) {
        val data = listData[position]
        holder.apply {
            bindData(data)
            binding.root.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(EXTRA_TYPE, data.id)
                Navigation.findNavController(holder.itemView)
                    .navigate(R.id.detailFragment, bundle)
            }
        }
    }

    override fun getItemCount(): Int = listData.size

    companion object {
        lateinit var EXTRA_TYPE: String
    }
}
