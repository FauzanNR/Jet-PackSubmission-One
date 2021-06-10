package com.app.jetpacksubmissionone.activity

import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.adapter.RecyclerDataAdapter
import com.app.jetpacksubmissionone.data.Data
import junit.framework.TestCase
import org.hamcrest.CoreMatchers.not
import org.hamcrest.core.IsEqual
import org.junit.Assert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest : TestCase() {

    private val movieDataTest = Data.getDataMovie()
    private val tvDataTest = Data.getDataTv()

    private val navController = TestNavHostController(
        ApplicationProvider.getApplicationContext()
    )

    //    val activity = ActivityTestRule(MainActivity::class.java)
    //    val a: ActivityScenario<MainActivity> = ActivityScenario.launch(MainActivity::class.java)
    @get:Rule
    var activity: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun mainTest() {

//create TestNavigationHostController
        activity.scenario.onActivity { act ->
            navController.setGraph(R.navigation.main_navigation)
            Navigation.setViewNavController(act.findViewById(R.id.fragment_host), navController)
        }
//check navigation
        onView(withId(R.id.id_bottom_nav)).check(matches(isDisplayed()))
        onView(withId(R.id.id_nav_menu_movie)).perform(ViewActions.click())
        assertThat(navController.currentDestination?.id, IsEqual(R.id.id_nav_menu_movie))
        activity.scenario.onActivity { navController.setCurrentDestination(R.id.id_nav_menu_tv) }
        onView(withId(R.id.id_nav_menu_tv)).perform(ViewActions.click())
        assertThat(navController.currentDestination?.id, IsEqual(R.id.id_nav_menu_tv))
//cek recycler view Movie
        pressBack()
        onView(withId(R.id.id_recview_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.id_recview_movie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerDataAdapter.DataAdapterViewHolder>(
                (movieDataTest.size)
            )
        )
//select movie item
        onView(withId(R.id.id_recview_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerDataAdapter.DataAdapterViewHolder>(
                0,
                ViewActions.click()
            )
        )
//cek movie detail
        onView(withId(R.id.id_detail_poto)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_title)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_rating)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_tahun)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_description)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))

//cek recycler view Tv show
        pressBack()
        onView(withId(R.id.id_nav_menu_tv)).perform(ViewActions.click())
        onView(withId(R.id.id_recview_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.id_recview_tv)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerDataAdapter.DataAdapterViewHolder>(
                (tvDataTest.size)
            )
        )
//select tv item
        onView(withId(R.id.id_recview_tv)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerDataAdapter.DataAdapterViewHolder>(
                0,
                ViewActions.click()
            )
        )
//cek tv detail
        onView(withId(R.id.id_detail_poto)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_title)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_rating)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_tahun)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
        onView(withId(R.id.id_detail_description)).check(matches(isDisplayed()))
            .check(matches(not(withText(""))))
    }
}