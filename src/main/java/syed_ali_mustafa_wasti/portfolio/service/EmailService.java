package syed_ali_mustafa_wasti.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String fromEmail, String subject, String name, String messageText) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("aliwasti786@gmail.com");
        message.setSubject(subject + " - " + name);
        message.setText("From: " + fromEmail + "\n\n" + messageText);

        mailSender.send(message);
    }
}
