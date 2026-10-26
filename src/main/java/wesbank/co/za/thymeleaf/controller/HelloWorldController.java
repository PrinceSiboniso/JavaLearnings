package wesbank.co.za.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // handler methothod to handle hello world request
    //http://localhost:8080/hello-world
@GetMapping("/hello-world")
    public String helloWorld(Model model){
    model.addAttribute("message", "Hellow world!!!");
    return "hello-world";

    }
}
