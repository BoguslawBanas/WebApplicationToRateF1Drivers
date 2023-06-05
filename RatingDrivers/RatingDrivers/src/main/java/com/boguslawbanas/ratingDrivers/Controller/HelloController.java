package com.boguslawbanas.ratingDrivers.Controller;

import com.boguslawbanas.ratingDrivers.Repository.DriverRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    private final DriverRepository driverRepository;

    @Autowired
    public HelloController(DriverRepository driverRepository){
        this.driverRepository=driverRepository;
    }

    @GetMapping("/")
    public String home(Model model, HttpSession httpSession){
        model.addAttribute("drivers", driverRepository.findAll());
        return "pageToRate";
    }
}
