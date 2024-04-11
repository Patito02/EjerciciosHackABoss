package com.hackaboss.Dia7Ej1apiConcesionaria.repository;

import com.hackaboss.Dia7Ej1apiConcesionaria.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VehicleRepository {

    List<Vehicle> listVehicles = new ArrayList<>();
    public Vehicle addVehicle(Vehicle vehicle) {
        vehicle.setId(listVehicles.size() +1);
        listVehicles.add(vehicle);
        return vehicle;
    }

    public List<Vehicle> getVehicles() {
        return listVehicles;
    }

    public List<Vehicle> getVehiclesPrices() {
        return listVehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getPrice)).collect(Collectors.toList());
    }

    public Vehicle getVehicleById(Integer id) {
        return listVehicles.stream().filter(v->v.getId().equals(id)).findFirst().orElse(null);
    }
}
