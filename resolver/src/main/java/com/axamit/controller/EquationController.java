package com.axamit.controller;

import com.axamit.service.EquationAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EquationController {
    private final EquationAction equationAction;

    @Autowired
    public EquationController(EquationAction equationAction) {
        this.equationAction = equationAction;
    }

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/calculate")
    public String calculate(@RequestParam double factorA,
                            @RequestParam double factorB,
                            @RequestParam double factorC,
                            Model model) {

        model.addAttribute("solution", equationAction.calculate(factorA, factorB, factorC));
        return "index";
    }
}
