package com.app.jetpacksubmissionone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.adapter.RecyclerDataAdapter
import com.app.jetpacksubmissionone.databinding.FragmentTvBinding
import com.app.jetpacksubmissionone.viewmodel.TvShowViewModel


class TvFragment : Fragment() {

    lateinit var binding: FragmentTvBinding
    private lateinit var viewModel: TvShowViewModel
    private val recyclerViewAdapter: RecyclerDataAdapter by lazy {
        RecyclerDataAdapter().apply {
            notifyDataSetChanged()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tv, container, false)
        binding = FragmentTvBinding.bind(view)
        binding.idRecviewTv.layoutManager = LinearLayoutManager(view.context)
        binding.idRecviewTv.adapter = recyclerViewAdapter

        viewModel = ViewModelProvider(this).get(TvShowViewModel::class.java)
        recyclerViewAdapter.setListData(
            viewModel.listTv,
            "TV"
        )
        return view
    }
}