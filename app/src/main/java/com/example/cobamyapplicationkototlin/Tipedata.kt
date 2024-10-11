package com.example.cobamyapplicationkototlin

// Tipe data dasar di kotlin
fun main(){                         // digunakan untuk mendeklarasikan sebuah fungsi
    // Byte
    val byteValue: Byte = 10        // val --> digunakan untuk mendeklarasikan variabel yang bersifat konstan
    println("Byte: $byteValue")

    // Int
    val intValue: Int = 30
    println("Int: $intValue")

    // Float
    val floatValue: Float = 50.6f
    println("Float: $floatValue")

    // Double
    val doubleValue: Double =  60.6
    println("Double: $doubleValue")

    // Char
    val charValue: Char = 'A'
    println("Char: $charValue")

    // Boolean
    val booleanValue: Boolean = true
    println("Boolean: $booleanValue")

    // String
    var stringvalue: String = "Hello, world!"       // var --> digunakan untuk mendeklarasikan variabel yang bisa diubah
    println("String: $stringvalue")

    stringvalue =  "Hello, kotlin!"
    println("String: $stringvalue")
}