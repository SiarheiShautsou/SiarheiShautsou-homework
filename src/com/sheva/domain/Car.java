package com.sheva.domain;

import java.util.Objects;

import static com.sheva.domain.DefaultCarInfo.*;

public class Car implements CarMoveInterface, Comparable<Car> {

    public static final int DEFAULT_CAR_DOORS = 4;

    public static final int DEFAULT_CAR_SEATS = 5;

    public static final double DEFAULT_CAR_ENGINE_VOLUME = 2.0;

    private String carBrand;

    private String carModel;

    private String bodyType;

    private Integer doors;

    private Integer seats;

    private Double engineVolume;

    private String fuelType;

    public Car() {
        this.carBrand = defaultCarBrand;
        this.carModel = defaultCarModel;
        this.bodyType = defaultCarBodyType;
        this.doors = DEFAULT_CAR_DOORS;
        this.seats = DEFAULT_CAR_SEATS;
        this.engineVolume = DEFAULT_CAR_ENGINE_VOLUME;
        this.fuelType = defaultCarFuelType;

    }

    public Car(String carBrand, String carModel, String bodyType, int doors, int seats, double engineVolume, String fuelType) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.bodyType = bodyType;
        this.doors = doors;
        this.seats = seats;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doors == car.doors && seats == car.seats && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(carBrand, car.carBrand) && Objects.equals(carModel, car.carModel) && Objects.equals(bodyType, car.bodyType) && Objects.equals(fuelType, car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, bodyType, doors, seats, engineVolume, fuelType);
    }

    @Override
    public String toString() {
        return "Car{" + "carBrand='" + carBrand + '\'' + ", carModel='" + carModel + '\'' + ", bodyType='" + bodyType + '\'' + ", doors=" + doors + ", seats=" + seats + ", engineVolume=" + engineVolume + ", fuelType='" + fuelType + '\'' + '}';
    }

    @Override
    public int carRouteDistance(int speed, int hours) {
        int distance = speed * hours;
        return distance;
    }

    @Override
    public void carAcceleration() {
        System.out.println("Car accelerates from 0 to 100 km/h.");

    }

    @Override
    public void carBraking() {
        System.out.println("Car brakes from 60 km/h to full stop.");

    }


    @Override
    public int compareTo(Car car) {
        return (this.seats - car.seats);
    }

}
