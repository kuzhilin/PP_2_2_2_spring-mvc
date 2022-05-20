package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count",defaultValue = "5") Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Audi", "A6", 2015));
        cars.add(new Car("BMW", "X5", 2018));
        cars.add(new Car("Mazda", "CX5", 2017));
        cars.add(new Car("Ford", "Focus", 2010));
        model.addAttribute("cars", cars.subList(0,(count > 5) ? 5  : count));
        return "cars";
    }
}
