package com.app.jetpacksubmissionone.viewmodel

import androidx.lifecycle.ViewModel
import com.app.jetpacksubmissionone.data.Data
import com.app.jetpacksubmissionone.model.Film

class DetailViewModel : ViewModel() {
    private lateinit var film: Film

    fun setMovie(id: String): Film {
        for (data in Data.getDataMovie()) {
            if (id == data.id) {
                film = data
            }
        }
        return film
    }

    fun setTvShow(id: String): Film {
        for (data in Data.getDataTv()) {
            if (id == data.id) {
                film = data
            }
        }
        return film
    }
}