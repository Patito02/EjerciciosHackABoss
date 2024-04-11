package com.hackaboss.Dia7Ej1apiConcesionaria.service;

import com.hackaboss.Dia7Ej1apiConcesionaria.model.Vehicle;
import com.hackaboss.Dia7Ej1apiConcesionaria.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IVehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.addVehicle(vehicle);
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicleRepository.getVehicles();
    }

    @Override
    public List<Vehicle> getVehiclesPrices() {
        return vehicleRepository.getVehiclesPrices();
    }

    @Override
    public Vehicle getVehicleById(Integer id) {
        return vehicleRepository.getVehicleById(id);
    }
}
