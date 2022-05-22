package com.sheva;

import com.sheva.domain.Car;
import com.sheva.domain.CarMoveInterface;
import com.sheva.exception.CarNotFoundException;
import com.sheva.util.CarGenerator;

import java.util.Arrays;

import static com.sheva.service.CarFind.findCars;
import static com.sheva.util.CarArrayPrint.printArray;

public class Main {
    public static void main(String[] args) {
        /* How many cars we wats to generate.*/
        int carCount = 10;

        /*"It's an array of " + carCount + " cars.*/
        Car[] carArray = CarGenerator.createArrayMethod(carCount);
        printArray(carArray);


        /*It's a sorted cars array by seats number.*/
        Arrays.sort(carArray);
        printArray(carArray);

        /*We call methods
         * param carSpeed - average car speed of the route
         * param routeHours - time on the route*/
        int carSpeed = 60;
        int routeHours = 3;

        for (Car car : carArray) {

            CarMoveInterface movement = car;

            movement.carAcceleration();
            movement.carBraking();
            System.out.println("Car passed " + movement.carRouteDistance(carSpeed, routeHours) + "kilometers.");

            //This is the param change for the next car.
            carSpeed += 5;
            routeHours += 1;
        }

        /*CarNotFoundException test in array of cars.*/
        try {

            String searchCarName = "Tesla";
            System.out.println(findCars(searchCarName, carArray));

        } catch (CarNotFoundException e) {
            System.err.println("There aren't such cars in the array");
        }
    }
}
