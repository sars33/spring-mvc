package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.UserService;
import web.service.UserServiceImp;

import java.util.List;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCars(Long count, ModelMap model) {

        UserService service = new UserServiceImp();
        if (count == null) {
            List<Car> allCars = service.getcars();
            model.addAttribute("cars", allCars);
        } else {
            List<Car> carCounter = service.countCars(count);
            model.addAttribute("cars", carCounter);
        }
        return "cars";
    }

}
