package pl.oskarpolak.FristDefAppInSpring.controllers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "HelloWorld";
    }

    @GetMapping("/oskar/polak")
    @ResponseBody
    public String showOskar() {
        return "Oskar Polak";
    }

    @GetMapping("/greeting")
    public String showGreeting() {
        return "greetings";
    }


    @GetMapping("/welcome/{name}")
    @ResponseBody
    public String showWelcome(@PathVariable("name") String hello){
        return "Witaj, " + hello;
    }


    @GetMapping("/age/{name}/{age}")
    @ResponseBody
    public String showAge(@PathVariable("name") String hello,
                          @PathVariable("age") int age){
        return "Witaj, " + hello +
                (age >= 18 ? ". Jesteś pełnoletni" : " Nie jesteś");
    }





}
