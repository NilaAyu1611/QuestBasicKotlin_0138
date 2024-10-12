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

    // Try-Catch --> menangani kesalahan (exception) yang mungkin terjadi selama program
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid number")
    }
}


// Loops ---> ada 2 struktur yaitu for loop dan while loop
fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5) {               // menggunakan for loop --> mengulangi serangkaian nilai yang telah ditentukan
        println("Perulangan ke-$i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1                           // while --> untuk mengeksekusi blok kode selama ekspresi kondisional bernilai T
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    var y = 1                          // do-while --> mengeksekusi blok kode dulu baru memeriksa ekspresi kondisional.
    do {
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}
