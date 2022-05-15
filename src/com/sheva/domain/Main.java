package com.sheva.domain;

import com.sheva.exception.CarNotFoundException;
import com.sheva.util.CarGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* How many cars we wats to generate.*/
        int carCount = 10;

        System.out.println("It's an array of " + carCount + " cars.");
        Car [] carArray = CarGenerator.createArrayMethod(carCount);
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i]);

        }


        System.out.println("It's a sorted cars array by seats number.");
        Arrays.sort(carArray);
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i]);

        }

        System.out.println("");

        int carSpeed = 60;
        int routeHours = 3;

        for (Car car : carArray) {

            System.out.println(car);

            CarMoveInterface movement = car;

            movement.carAcceleration();
            movement.carBraking();
            System.out.println("Car passed " + movement.carRouteDistance(carSpeed, routeHours) + "kilometers.");

            carSpeed += 5;
            routeHours += 1;


        }

        System.out.println("CarNotFoundException test in array of cars.");

        try{
            Car car1 = new Car();

            car1.findCars("Tesla", carArray);

        }catch(CarNotFoundException e){}
        finally {
            System.out.println("There aren't such cars in the array");

        }



    }
}
