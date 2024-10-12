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

    // Mengubah data di salam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape      // Mencegah modifikasi yang tidak diininkan, jadi hanya view yang bersifat Read-Only dari mutable list
    println(shapesLocked)
}

fun ContohSet() {
    println()
    println("=== Set ===")          // Set --> data yang tidak urut, tetapi unik / tidak bsa menyimpan data double

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(println(readOnlyAbjad))

    // Set Mutable --> dapat diubah, unik dan tidak berurutan
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

}