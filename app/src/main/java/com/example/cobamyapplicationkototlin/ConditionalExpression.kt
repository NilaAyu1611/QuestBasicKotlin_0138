package com.example.cobamyapplicationkototlin

// === Conditional Expression ===
// Conditional expression --> ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement() {
    println("=== Conditional Expression")

// If-else --> memeriksa kondisi & melakukan sesuatu jika T & F
    val number = 10
    if (number > 0) {
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // When
    val day = 1                     // Deklarasi variabel
    when (day) {                    // ekpresi bersyarat dengan beberapa cabang
        1 -> println("Sunday")      // tanda -> untuk memisahkan setiap kondisi dari setiap tindakan
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }


}
