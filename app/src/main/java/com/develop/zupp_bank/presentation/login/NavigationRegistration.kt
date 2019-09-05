package com.develop.zupp_bank.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.develop.zupp_bank.R
import com.develop.zupp_bank.infrastructure.base.ZuppBaseActivity
import kotlinx.android.synthetic.main.activity_navigation_registration.*

class NavigationRegistration : ZuppBaseActivity<NavigationRegistration>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_registration)

        toolbar = findViewById(R.id.toolbar)
        toolbar.title = ""

        setSupportActionBar(toolbar)
        setupNavigation()
    }

    private fun setupNavigation() {
        navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)
        NavigationUI.setupWithNavController(toolbar, navController)


    }
}
