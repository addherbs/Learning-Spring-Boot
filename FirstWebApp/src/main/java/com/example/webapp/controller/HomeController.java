package com.example.webapp.controller;

import com.example.webapp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class HomeController {
    // Change the working directory to `./Learning-Spring-Boot\FirstWebApp` in IntelliJ run config in case all requests return 404

    @GetMapping("/home")
    public ModelAndView home(@Valid Person person) {
        return new ModelAndView("home", "obj", person);
    }
}
