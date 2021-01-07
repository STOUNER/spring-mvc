package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarGet {
    @Autowired
    private CarService carService;

    @GetMapping("car")
    public String getCar(Model model, HttpServletRequest request) {
        List<Car> carList = carService.getAllCar();
        String count = request.getParameter("count");
        if (count != null && Integer.parseInt(count) < 5) {
            List<Car> listBySplit = carList.subList(0,Integer.parseInt(count));
            model.addAttribute("carList",listBySplit);
            return "cartable";
        } else {
            model.addAttribute("carList",carList);
            return "cartable";
        }
    }
}
