package com.app.jetpacksubmissionone.viewmodel

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest : TestCase() {
    private lateinit var viewModelTest: TvShowViewModel

    @Before
    override fun setUp() {
        viewModelTest = TvShowViewModel()
    }

    @Test
    fun testGetListTv() {
        val a = viewModelTest.listTv
        assertNotNull(a)
        assertEquals(11, a.size)
    }
}