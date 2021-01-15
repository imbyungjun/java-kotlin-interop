package com.example

open class Person(
    @get:JvmName("name") val name: String = "임병준"
) {
    @JvmName("sayHello")
    fun hello(): String = "Hello, ${name}!"
}