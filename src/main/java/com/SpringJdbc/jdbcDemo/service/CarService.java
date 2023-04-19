package com.SpringJdbc.jdbcDemo.service;

import com.SpringJdbc.jdbcDemo.model.Car;

import java.util.List;
import java.util.Map;

public interface CarService {

    List<Car> fetchCarList();

    String addNewCar(Car car);

    String updateCar(Car car);

    String deleteCar(Long id);

    List<Map<String,Object>>fetchCarListByBrand(Long brandId);
}
