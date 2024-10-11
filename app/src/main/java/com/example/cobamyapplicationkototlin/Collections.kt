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

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")  // metdos add
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

}