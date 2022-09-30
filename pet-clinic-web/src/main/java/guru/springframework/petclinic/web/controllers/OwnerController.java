package guru.springframework.petclinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/owners"})
public class OwnerController {

    @GetMapping
    public String loadHomePage(){
        return "owners/home";
    }
}
