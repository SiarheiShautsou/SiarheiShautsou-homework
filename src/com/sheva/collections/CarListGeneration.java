package com.sheva.collections;

import com.sheva.domain.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CarListGeneration {

    public static List arrayListGeneration(int value){

        List<Car> carArrayList = new ArrayList<>();

        for(int i = 0; i < value; i++){
            carArrayList.add(new Car());
        }

        return carArrayList;
    }

    public static List linkedListGeneration(int value){

        List<Car> carLinkedList = new LinkedList<>();

        for(int i = 0; i < value; i++){
            carLinkedList.add(new Car());
        }

        return carLinkedList;
    }
}
