package com.SpringJdbc.jdbcDemo.controller;

import com.SpringJdbc.jdbcDemo.model.Car;
import com.SpringJdbc.jdbcDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/getCarList")
    public List<Car> getCarList(){
        return carService.fetchCarList();
    }

    @PostMapping("/addCar")
    public String addCar(@RequestBody Car car){
        return carService.addNewCar(car);
    }

    @PutMapping("/updateCar")
    public String updateCarInfo(@RequestBody Car car){
        return carService.updateCar(car);
    }

    @DeleteMapping("/deleteCar/{id}")
    public String removeCar(@PathVariable Long id){
        return carService.deleteCar(id);
    }

    @GetMapping("/cars/{brandId}")
    public List<Map<String,Object>> fetchCarListByBrandId(@PathVariable Long brandId){
        return carService.fetchCarListByBrand(brandId);
    }
}
