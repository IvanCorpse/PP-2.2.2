package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService cs;

    @Autowired
    public CarController(CarService csi) {
        this.cs = csi;
    }

    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("count", count);
        model.addAttribute("cars", cs.getCarList(count));
        return "cars";
    }
}
