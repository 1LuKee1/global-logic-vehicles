package org.example.domain;

public class Bicycle implements Vehicle {
    private String company;
    private double maxSpeed;

    public Bicycle(String company, double maxSpeed) {
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getType() {
        return "BICYCLE";
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
        return "Bicycle{" +
                "company='" + company + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}