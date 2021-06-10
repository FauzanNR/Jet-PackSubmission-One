package com.app.jetpacksubmissionone.viewmodel

import androidx.lifecycle.ViewModel
import com.app.jetpacksubmissionone.data.Data
import com.app.jetpacksubmissionone.model.Film

class TvShowViewModel : ViewModel() {
    val listTv: ArrayList<Film> by lazy {
        Data.getDataTv()
    }
}