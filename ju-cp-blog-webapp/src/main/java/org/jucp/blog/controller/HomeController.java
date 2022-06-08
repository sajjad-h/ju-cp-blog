package org.jucp.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class HomeController{

    @GetMapping(path = "")
    public String viewHomePage(Model model) {
        return "redirect:/blogs";
    }
}