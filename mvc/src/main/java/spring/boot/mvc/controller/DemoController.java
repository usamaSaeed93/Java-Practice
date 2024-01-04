package spring.boot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import spring.boot.mvc.models.User;

import javax.validation.Valid;
@Controller
public class DemoController {

//    @GetMapping("/form")
//    public String showForm(Model model) {
//        model.addAttribute("user", new User());
//        return "helloworld"; // Assuming the form template is named "helloworld.html"
//    }
//
//
//    @GetMapping("/displayUser")
//    public String displayUser() {
//        return "userForm"; // Assuming the user details display template is named "userForm.html"
//    }
}
