package com.app.jetpacksubmissionone.viewmodel

import com.app.jetpacksubmissionone.data.Data
import com.app.jetpacksubmissionone.model.Film
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class DetailViewModelTest : TestCase() {

    private lateinit var viewModel: DetailViewModel
    val id = 0
    val movie = Data.getDataMovie()[0]
    val tv = Data.getDataTv()[0]

    val dummy = Film(
        "12",//test ganti id
        movie.title,
        movie.tahun,
        movie.rating,
        movie.description,
        movie.poto
    )

    @Before
    override fun setUp() {
        viewModel = DetailViewModel()
    }

    @Test
    fun testSetMovie() {
        val a = viewModel.setMovie(id.toString())
        assertNotNull(a)
        assertEquals(
//            dummy.toString(),
            movie.toString(),
            a.toString()
        )
    }

    @Test
    fun testSetTvShow() {
        val b = viewModel.setTvShow(id.toString())
        assertNotNull(b)
        assertEquals(
            tv.toString(),
            b.toString()
        )
    }
}