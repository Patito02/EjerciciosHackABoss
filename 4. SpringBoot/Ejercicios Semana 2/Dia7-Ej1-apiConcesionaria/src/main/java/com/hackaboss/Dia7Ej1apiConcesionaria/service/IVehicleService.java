package com.hackaboss.Dia7Ej1apiConcesionaria.service;

import com.hackaboss.Dia7Ej1apiConcesionaria.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    public Vehicle addVehicle(Vehicle vehicle);

    List<Vehicle> getVehicles();

    List<Vehicle> getVehiclesPrices();

    Vehicle getVehicleById(Integer id);
}
