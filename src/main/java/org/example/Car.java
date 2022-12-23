package org.example;

public class Car implements Vehicle {

    private String company;
    private double maxSpeed;

    public Car(String manufacturer, double maxSpeed) {
        this.company = manufacturer;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getType() {
        return "CAR";
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}