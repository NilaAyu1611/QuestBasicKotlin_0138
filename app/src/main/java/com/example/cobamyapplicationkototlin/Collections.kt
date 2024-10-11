package com.example.cobamyapplicationkototlin

fun ContohList() {
    println("=== List ===")         // menyimpan data sesuai urutan penambahannya dan bisa duplikat
    // List Read-Only, data yang tidak bisa ditambah/diubah
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)          // mencetak elemenya


    // List Mutable --> data yang bisa diubah
    val shape: MutableList<String> =
        mutableListOf("Circle", "Square", "Triangle")
    println(shape)

}