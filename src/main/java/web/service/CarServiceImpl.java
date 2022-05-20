package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    List<Car> cars;

    public CarServiceImpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Audi", "A6", 2015));
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Mazda", "CX5", 2017));
        cars.add(new Car("Ford", "Focus", 2010));
    }

    @Override
    public List<Car> getCars(Integer count) {
        return (count >= 5) ? cars : cars.subList(0,count);
    }
}
