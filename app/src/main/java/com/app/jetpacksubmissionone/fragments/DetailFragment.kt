package com.app.jetpacksubmissionone.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.adapter.RecyclerDataAdapter.Companion.EXTRA_TYPE
import com.app.jetpacksubmissionone.databinding.FragmentDetailBinding
import com.app.jetpacksubmissionone.model.Film
import com.app.jetpacksubmissionone.viewmodel.DetailViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.bottomnavigation.BottomNavigationView


class DetailFragment : Fragment() {
    private lateinit var id: String
    private lateinit var data: Film
    private lateinit var detailViewModel: DetailViewModel
    private lateinit var binding: FragmentDetailBinding
    private lateinit var bottomNavigationView: BottomNavigationView

    private fun setType() {
        if (arguments != null)
            arguments?.let {
                when {
                    it.containsKey("MOVIE") -> {
                        id = it.getString(EXTRA_TYPE).toString()
                        data = detailViewModel.setMovie(id)
                    }
                    it.containsKey("TV") -> {
                        id = it.getString(EXTRA_TYPE).toString()
                        data = detailViewModel.setTvShow(id)
                    }
                    else -> {
                    }
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        binding = FragmentDetailBinding.bind(view)
        bottomNavigationView =
            requireActivity().findViewById<View>(R.id.id_bottom_nav) as BottomNavigationView
        bottomNavigationView.visibility = View.GONE

        detailViewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        Log.d(EXTRA_TYPE, EXTRA_TYPE)
        setType()
        binding.apply {
            idDetailTitle.text = data.title
            idDetailRating.text = data.rating
            idDetailTahun.text = data.tahun
            idDetailDescription.text = data.description
            Glide.with(view).load(data.poto)
                .apply(RequestOptions())
                .override(175, 250)
                .into(idDetailPoto)
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        requireActivity().invalidateOptionsMenu()
        inflater.inflate(R.menu.share, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.id_share_btn -> {
            val intent: Intent = Intent(Intent.ACTION_SEND).setType("text/plain")
                .putExtra(Intent.EXTRA_TEXT, "https://github.com/FauzanNR/Apps")
            startActivity(Intent.createChooser(intent, "Share Via"))
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bottomNavigationView.visibility = View.VISIBLE
    }

}