package com.example;

import com.example.Singer;
import org.junit.Test;

public class SingerTest {
    private final Singer singer = new Singer("러블리즈");

    @Test
    public void sayHelloTest() {
        System.out.println(singer.sayHello());
        System.out.println(singer.name());
    }
}