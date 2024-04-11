package com.hackaboss.Dia7Ej1apiConcesionaria.controller;

import com.hackaboss.Dia7Ej1apiConcesionaria.model.Vehicle;
import com.hackaboss.Dia7Ej1apiConcesionaria.service.IVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private IVehicleService vehicleService;
    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }
    @GetMapping
    public List<Vehicle> getVehicles(){
        return vehicleService.getVehicles();
    }
    @GetMapping("/prices")
    public List<Vehicle> getVehiclesPrices(){
        return vehicleService.getVehiclesPrices();
    }
    @GetMapping("/{id}")
    public Vehicle getVehicleById(@PathVariable Integer id){
        return vehicleService.getVehicleById(id);
    }
}
