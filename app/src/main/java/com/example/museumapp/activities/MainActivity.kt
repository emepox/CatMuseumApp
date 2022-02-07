package com.example.museumapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.museumapp.R
import com.example.museumapp.databinding.ActivityMainBinding
import com.example.museumapp.fragments.CategoriesFragment
import com.example.museumapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_holder)
        if (currentFragment is HomeFragment) {
            currentFragment.onButtonClick = {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_holder, CategoriesFragment())
                    .setReorderingAllowed(true)
                    .addToBackStack("add")
                    .commit()
    }
}}}