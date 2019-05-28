package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculateService;
import service.CalculateServiceImpl;

@Controller
public class CalculateController {
    private CalculateService calculateService = new CalculateServiceImpl();

    @GetMapping("/")
    public String calculate() {
        return "index";
    }

    @PostMapping("/")
    public String result(@RequestParam("numberOne") float a, @RequestParam("numberTwo") float b, @RequestParam("operand") String operand, Model model) {
        String result = calculateService.calculate(a, b, operand);
        model.addAttribute("result", result);
        return "index";
    }
}
