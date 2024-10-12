package com.example.cobamyapplicationkototlin

// Fungsi tanpa parameter --> tidak menerima input apapun
fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

// Fungsi dengan parameter --> menerima 1 parameter (name)
fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}


// === Named argument ===
// Named argument --> cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}


// === Default parameter values ===
// Default parameter value --> cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

// Fungsi dengan return value
fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun main() {                        // Memanggil semua fungsi yang telah dideklarasikan
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}

