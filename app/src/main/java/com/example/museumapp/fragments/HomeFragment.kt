package com.example.museumapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.museumapp.R
import com.example.museumapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    var onButtonClick: () -> Unit = {}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Initialise the binding
        val binding = FragmentHomeBinding.bind(view)

        binding.btnHome.setOnClickListener { onButtonClick() }
    }


}