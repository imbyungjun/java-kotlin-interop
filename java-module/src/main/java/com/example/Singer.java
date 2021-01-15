package com.example;

import org.jetbrains.annotations.NotNull;

public class Singer extends Person {
    public Singer(@NotNull String name) {
        super("*" + name + "*");
    }
}
