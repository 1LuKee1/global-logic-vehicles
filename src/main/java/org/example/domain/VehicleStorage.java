package org.example.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleStorage {

    public static Map<String, List<Vehicle>> getSampleVehicles() {
        Map<String, List<Vehicle>> vehicles = new HashMap<>();

        List<Vehicle> cars = new ArrayList<>();
        cars.add(new Car("BMW", 250.0));
        cars.add(new Car("Audi", 220.0));
        vehicles.put("CAR", cars);

        List<Vehicle> ships = new ArrayList<>();
        ships.add(new Ship("Titanic", 50.0));
        ships.add(new Ship("Queen Mary", 45.0));
        vehicles.put("SHIP", ships);

        List<Vehicle> planes = new ArrayList<>();
        planes.add(new Plane("Boeing 337", 900.0));
        planes.add(new Plane("Airbus A380", 850.0));
        vehicles.put("PLANE", planes);

        List<Vehicle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle("Trek", 30.0));
        bicycles.add(new Bicycle("Specialized", 25.0));
        vehicles.put("BICYCLE", bicycles);

        return vehicles;
    }
}


