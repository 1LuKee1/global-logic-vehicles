package org.example.domain;

public class Ship implements Vehicle {

    private String company;
    private double maxSpeed;

    public Ship(String company, double maxSpeed) {
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getType() {
        return "SHIP";
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
        return "Ship{" +
                "manufacturer='" + company + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}