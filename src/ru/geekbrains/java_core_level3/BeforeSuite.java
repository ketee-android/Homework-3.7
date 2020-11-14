package ru.geekbrains.java_core_level3;

import java.lang.annotation.*;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface BeforeSuite {
    }
