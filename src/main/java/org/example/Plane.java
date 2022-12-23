package org.example;

public class Plane implements Vehicle {

    private String company;
    private double maxSpeed;

    public Plane(String company, double maxSpeed) {
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getType() {
        return "PLANE";
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
        return "Plane{" +
                "company='" + company + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
