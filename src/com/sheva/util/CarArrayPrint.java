package com.sheva.util;

import com.sheva.domain.Car;

public class CarArrayPrint {

    public static void printArray(Car[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

}
