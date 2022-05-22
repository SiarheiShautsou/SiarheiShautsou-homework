package com.sheva.collections;

import com.sheva.domain.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.sheva.collections.CarListGeneration.arrayListGeneration;
import static com.sheva.collections.CarListGeneration.linkedListGeneration;

public class ListTest {
    public static void main(String[] args) {

        int carNumbers = 1000000;

        long startArrayListAdd = System.currentTimeMillis();

        List<Car> carsArrayList = new ArrayList<>(arrayListGeneration(carNumbers));

        long endArrayListAdd = System.currentTimeMillis();
        long resultArrayListAdd = endArrayListAdd - startArrayListAdd;


        long startLinkedListAdd = System.currentTimeMillis();

        List<Car> carsLinkedList = new LinkedList<>(linkedListGeneration(carNumbers));

        long endLinkedListAdd = System.currentTimeMillis();
        long resultLinkedListAdd = endLinkedListAdd - startLinkedListAdd;

        System.out.println("Array list process: " + resultArrayListAdd);
        System.out.println("Linked list process: " + resultLinkedListAdd);

        long startArrayListRemove = System.currentTimeMillis();

        carsArrayList.remove(2);

        long endArrayListRemove = System.currentTimeMillis();
        long resultArrayListRemove = endArrayListRemove - startArrayListRemove;

        long startLinkedListRemove = System.currentTimeMillis();

        carsLinkedList.remove(400000);

        long endLinkedListRemove = System.currentTimeMillis();
        long resultLinkedListRemove = endLinkedListRemove - startLinkedListRemove;

        System.out.println("Array list remove process: " + resultArrayListRemove);
        System.out.println("Linked list remove process: " + resultLinkedListRemove);





    }
}
