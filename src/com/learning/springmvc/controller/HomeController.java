package com.learning.springmvc.controller;

import com.learning.springmvc.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @Autowired
    HomeService homeService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String users(Model model) {
        String name = homeService.getUser();
        model.addAttribute("username", name);
        return "index";
    }
}
