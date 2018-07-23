package pl.oskarpolak.FristDefAppInSpring.controllers;

import jdk.vm.ci.code.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.FristDefAppInSpring.models.forms.RegisterForm;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password){

        return "Dostałem dane! Twój login to: " + login;
    }


    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("registerForm") RegisterForm registerForm) {
        if(registerForm.getPassword().equals(registerForm.getPasswordRepeat())){
            return "redirect:/login";
        }

        return "register";
    }











}
