package com.example.cobamyapplicationkototlin

                // Membantu mencegah masalah dengan nlai null.
                //  Null safety mendeteksi potensi masalah dengan nilai null pada saat kompilasi, bukan pada saat dijalankan.
fun nullSafety() {
        // neverNull has String type --> tidak bisa bernilai null
    var neverNull: String = "This can't be null"

        // Throws a compiler error --> nevernull tidak dizinkan bernilai null
        // neverNull = null

        // nullable has nullable String type --> bisa menyimpan nilai null
    var nullable: String? = "You can keep a null here"
        // This is OK
    nullable = null


    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator --> jika nullable null, maka length tidak akan dipanggil
    println(neverNull.length) // 18
    println(nullable?.length) // null


    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    // Menggunakan fungsi strlength degan nevernull (bukan tipe nullable
    println(strLength(neverNull)) //18

}

fun main() {
    nullSafety()
}