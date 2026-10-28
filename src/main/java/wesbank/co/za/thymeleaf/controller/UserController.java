package wesbank.co.za.thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wesbank.co.za.thymeleaf.model.User;

@Controller
public class UserController {

    // handler method to handle variable -expresion request
@GetMapping("variable-expresson")
    public String variableExprerssion(Model model){
    User user = new User("Prince", "ntimza@gmail.com","admin","java");
        model.addAttribute("user", user);
        return "variable-expresson";

    }


    // handler method to handle selection expressions

    public String  selectionExpressi(Model model){
        User user = new User("Prince", "ntimza@gmail.com","admin","java");
        model.addAttribute("user", user);
        return "variable-expresson";
    }


    @GetMapping("message -expression")
    public String messageExpression(){
     return  "message-expression";
    }
}
