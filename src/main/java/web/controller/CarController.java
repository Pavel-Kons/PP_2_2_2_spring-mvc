package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public String myCarMeth(ModelMap model, HttpServletRequest request) {
        String count = request.getParameter("3");

        model.addAttribute("cars", carService.getCars(5));
        return "car";
    }
}
