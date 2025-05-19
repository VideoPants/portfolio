package syed_ali_mustafa_wasti.portfolio;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import syed_ali_mustafa_wasti.portfolio.controller.ProfileController;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

    @Autowired
    private ProfileController profileController;

    @PostConstruct
    public void automateHome() {
        profileController.getHome();
        System.out.println("http://localhost:8080/");
    }
    @PostConstruct
    public void automateProjects() {
        profileController.getProjects();
    }
    @PostConstruct
    public void automateContact() {
        profileController.getContact();
    }
}
