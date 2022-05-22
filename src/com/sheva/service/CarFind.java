package com.sheva.service;

import com.sheva.domain.Car;
import com.sheva.exception.CarNotFoundException;

public class CarFind {
    public static Car findCars(String name, Car[] c) {

        Car car = new Car();

        for (int i = 0; i < c.length; i++) {
            if (name.equalsIgnoreCase(c[i].getCarBrand())) {
                car = c[i];
            } else car = null;
        }
        if (car == null) throw new CarNotFoundException("error", "object not exist");
        else return car;
    }
}
