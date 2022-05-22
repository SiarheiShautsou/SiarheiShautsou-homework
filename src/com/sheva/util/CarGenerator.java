package com.sheva.util;

import com.sheva.domain.Car;

import static com.sheva.domain.CarNamesInterface.brand;

public class CarGenerator {

    public static Car[] createArrayMethod(int count) {

        String[] model = new String[]{"Focus RS", "S6", "M5", "Passat R-line", "911"};
        String[] bodyTypes = {"hatchback", "saloon", "coupe", "wagon", "cabriolet"};
        int[] doorsNumber = {5, 4, 4, 4, 2};
        int[] seatsNumber = {5, 4, 4, 5, 2};
        double[] engines = {1.8, 2.5, 3.0, 2.0, 3.5};

        Car[] carsArray = new Car[count];
        for (int i = 0; i < count; i++) {

            int c = (int) (Math.random() * (brand.length - 1));

            carsArray[i] = new Car(brand[c], model[c], bodyTypes[c], doorsNumber[c], seatsNumber[c], engines[c], "petrol");

        }

        return carsArray;
    }


}
