package com.app.jetpacksubmissionone.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.adapter.RecyclerDataAdapter
import com.app.jetpacksubmissionone.databinding.FragmentMovieBinding
import com.app.jetpacksubmissionone.viewmodel.MovieViewModel


class MovieFragment : Fragment() {
    lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel
    private val recyclerViewAdapter: RecyclerDataAdapter by lazy {
        RecyclerDataAdapter().apply {
            notifyDataSetChanged()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie, container, false)
        binding = FragmentMovieBinding.bind(view)
        binding.idRecviewMovie.layoutManager = LinearLayoutManager(view.context)
        binding.idRecviewMovie.adapter = recyclerViewAdapter

        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        recyclerViewAdapter.setListData(
            viewModel.listMovie,
            "MOVIE"
        )
        Log.d("TAG", "ViewModelTAG")

        return view
    }
}