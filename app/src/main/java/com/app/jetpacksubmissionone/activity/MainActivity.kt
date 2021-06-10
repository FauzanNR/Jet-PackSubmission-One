package com.app.jetpacksubmissionone.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.app.jetpacksubmissionone.R
import com.app.jetpacksubmissionone.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var navigationFragmentController: NavController
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        bottomNavigationView = findViewById(R.id.id_bottom_nav)
        setUpFragment()
    }

    fun setUpFragment() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_host) as NavHostFragment
        navigationFragmentController = navHostFragment.navController

        NavigationUI.setupWithNavController(bottomNavigationView, navigationFragmentController)
        val appBarConfiguration =
            AppBarConfiguration(setOf(R.id.id_nav_menu_movie, R.id.id_nav_menu_tv))
        setupActionBarWithNavController(navigationFragmentController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        navigationFragmentController.navigateUp()
        return super.onSupportNavigateUp()
    }
}