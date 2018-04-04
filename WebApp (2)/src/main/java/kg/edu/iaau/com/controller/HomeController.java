package kg.edu.iaau.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {



    @RequestMapping("/message")
    public String viewMessage(Model model)
    {
        //model.addAttribute("name", "COM");
        model.addAttribute("message", "Your Message!");

        return "message";
    }

}