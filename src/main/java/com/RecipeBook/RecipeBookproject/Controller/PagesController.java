package com.RecipeBook.RecipeBookproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {
    @GetMapping("/login")
    public String login() {
        return "login"; // This should be the name of your login HTML template
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
