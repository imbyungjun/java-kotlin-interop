package com.example

import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.Test

class BasicUsage {
    @Test
    fun sayHelloTest() {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://naver.com")
            .build()

        val response = client.newCall(request).execute()
        response.use {
            assert(it.code == 200)
            assert(it.body!!.bytes().isNotEmpty())
        }
    }
}