package com.app.jetpacksubmissionone.viewmodel

import androidx.lifecycle.ViewModel
import com.app.jetpacksubmissionone.data.Data
import com.app.jetpacksubmissionone.model.Film

class MovieViewModel : ViewModel() {

    val listMovie: ArrayList<Film> by lazy {
        Data.getDataMovie()
    }
}