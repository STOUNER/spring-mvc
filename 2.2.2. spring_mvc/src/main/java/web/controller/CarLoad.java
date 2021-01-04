package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarLoad {

    @Autowired
    private ApplicationContext appContext;

    @GetMapping("carload")
    public String LoadSomeCar(ModelMap model) {
        CarService addNewCar = appContext.getBean(CarService.class);
        addNewCar.addCar(new Car("BMW", 1461,"USER1"));
        addNewCar.addCar(new Car("BMW", 1462,"USER1"));
        addNewCar.addCar(new Car("BMW", 1463,"USER1"));
        addNewCar.addCar(new Car("BMW", 1464,"USER1"));
        model.addAttribute("hello");
        return "index";
    }
}
