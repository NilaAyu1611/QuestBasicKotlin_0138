package com.example.cobamyapplicationkototlin

class Motor()
                                                // Membuat objek dari sebuah kelas, dengan properti yang dideklarasi dengan val (tidak dapat diubah) dan var (dapat diubah)
class Contact(val id: Int, var email:String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

// Prints the value of the property: email
    println(contact.email)


// Updates the value of the property: email
    contact.email = "jane@gmail.com"

// Prints the new value of the property: email
    println(contact.email)

}

