package pl.oskarpolak.FristDefAppInSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
//nazwa klasy dowolna! powinna byc samoopisujaca sie :)
public class TemplateController {

    //nazwa metody dowolna!!!!!!
    //przekazanie obiektu do templatki
    @GetMapping("/sallary/{salaryUrl}")
    public String sallary(@PathVariable("salaryUrl") int salaryArg, Model model){
        model.addAttribute("salaryKey", salaryArg);
        return "showSalary";
    }

}
