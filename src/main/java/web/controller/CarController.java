package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/car")
    public String myCarMeth(ModelMap model) {
        List<String> message = new ArrayList<>();
        message.add("Car");
        model.addAttribute("Messages", message);
        return "index";
    }
}
