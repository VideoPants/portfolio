package syed_ali_mustafa_wasti.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @GetMapping("/projects")
    public String getProjects() {
        return "projects";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "contact";
    }
}
