package com.valeriisharipov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-Details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {
        return "show-emp-Details-view";
    }
}
