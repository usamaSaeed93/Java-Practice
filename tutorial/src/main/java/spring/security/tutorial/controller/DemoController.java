package spring.security.tutorial.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Controller
public class DemoController {
    @GetMapping("/hello")
    public String sayHello( Model model){
        model.addAttribute("currentDate" , new java.util.Date());
        return "helloworld";
    }
}
