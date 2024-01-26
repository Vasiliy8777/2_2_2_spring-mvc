package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.TabService;

@Controller
public class TableController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) String a, ModelMap modelCar) {
        modelCar.addAttribute("cars", new TabService().listCars(a == null ? "5" : a));
        return "tabcars";
    }
}
