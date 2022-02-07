package com.example.museumapp.data

data class ObjectModel(
    val objectID: Int,
    val primaryImageSmall: String,
    val department: String,
    val objectName: String,
    val title: String,
    val artistDisplayName: String,
    val artistDisplayBio: String,
    val objectDate: String,
    val medium: String
)
