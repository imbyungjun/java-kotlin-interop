package com.example

import org.junit.Test

class PersonTest {
    private val person: Person = Person()

    @Test
    fun sayHelloTest() {
        println(person.hello())
        println(person.name)
    }
}