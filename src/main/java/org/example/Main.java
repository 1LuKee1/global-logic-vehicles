package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<Vehicle>> vehicles = Vehicles.getSampleVehicles();


        while (true) {
            logger.error("Wybierz opcję (CAR, SHIP, PLANE, BICYCLE, ALL, EXIT):");
            String option = scanner.nextLine().toUpperCase();
            logger.error("Wybrano opcję: " + option);

            if (option.equals("EXIT")) {
                break;
            } else if (option.equals("ALL")) {
                for (Map.Entry<String, List<Vehicle>> entry : vehicles.entrySet()) {
                    logger.error("Najszybszy pojazd typu " + entry.getKey() + " to:");
                    Vehicle fastestVehicle = getFastestVehicle(entry.getValue());
                    logger.error("Pojazd " + fastestVehicle.getType() + " producenta " + fastestVehicle.getCompany()
                            + " (maksymalna prędkość: " + fastestVehicle.getMaxSpeed() + ")");
                }
            } else if (vehicles.containsKey(option)) {
                logger.error("Najszybszy pojazd typu " + option + " to:");
                Vehicle fastestVehicle = getFastestVehicle(vehicles.get(option));
                logger.error("Pojazd " + fastestVehicle.getType() + " producenta " + fastestVehicle.getCompany()
                        + " (maksymalna prędkość: " + fastestVehicle.getMaxSpeed() + ")");
            } else {
                logger.error("Podaj prawidłową opcję.");
            }
        }
    }

    private static Vehicle getFastestVehicle(List<Vehicle> vehicles) {
        Vehicle fastestVehicle = vehicles.get(0);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMaxSpeed() > fastestVehicle.getMaxSpeed()) {
                fastestVehicle = vehicle;
            }
        }
        return fastestVehicle;
    }
}