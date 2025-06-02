package syed_ali_mustafa_wasti.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import syed_ali_mustafa_wasti.portfolio.service.EmailService;

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

    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public String submitContactForm(@RequestParam String email, @RequestParam String subject, @RequestParam String name, @RequestParam String message, Model model) {
        emailService.sendEmail(email, subject, name, message);
        model.addAttribute("success", "Message sent successfully!");
        return "contact";
    }
}
