package com.example.cobamyapplicationkototlin

// === Lambda Functions ===
// Lambda Functions --> fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Functions menggunakan tanda panah -> untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {           // Fungsi standar
    return string.uppercase()
}

                // |
                // |
                // V

//Dapat ditulis dalam Lamda Expression (lebih ringkas)
fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))      // Lamda Expression
// HELLO
}
