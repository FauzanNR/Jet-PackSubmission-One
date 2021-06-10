package com.app.jetpacksubmissionone.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class MovieViewModelTest : TestCase() {
    private lateinit var viewModelTest: MovieViewModel

    @Before
    override fun setUp() {
        viewModelTest = MovieViewModel()
    }

    @Test
    fun testGetListMovie() {
        val a = viewModelTest.listMovie
        assertNotNull(a)
        assertEquals(11, a.size)
    }
}