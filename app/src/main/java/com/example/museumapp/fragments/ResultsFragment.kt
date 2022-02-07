package com.example.museumapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentResultListener
import com.example.museumapp.R
import com.example.museumapp.databinding.FragmentResultsBinding

class ResultsFragment : Fragment(R.layout.fragment_results) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        // Initialise the binding
        val binding = FragmentResultsBinding.bind(view)


        // TODO. CAMBIAR ESTOS DATOS

        /*
        // Set the adapter to the recycler view
        val recyclerView = binding.rvNotes

        // Read from the SharedPreferences
        val myData: List<Note> = NotesRepository().getAllNotes(requireContext())

        // Create an adapter and give data
        val myAdapter = SimpleRecyclerAdapter(myData)

        recyclerView.adapter = myAdapter

        // SETS A LAYOUT MANAGER
        recyclerView.layoutManager = GridLayoutManager(view.context, 2)

        // ON CLICK LISTENERS
        binding.btnAdd.setOnClickListener {
            onButtonClick()
        }

         */
    }
}