package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest req) {

        HttpSession session = req.getSession();

        String name = req.getParameter("name");
        System.out.println("Came on to home Route " + name);

        session.setAttribute("name", name);

        return "home";
    }
}
