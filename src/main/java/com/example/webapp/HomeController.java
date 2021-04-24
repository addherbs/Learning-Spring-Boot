package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(String name, HttpSession session, @RequestParam("age") int myAge) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", myAge);
        mv.setViewName("home");

        return mv;
    }
}
