package pl.weglewski.praca_tydzien6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import pl.weglewski.praca_tydzien6.service.EmailService;

import javax.mail.MessagingException;

@Aspect
@Controller
public class EmailController {

    private EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @After(value = "@annotation(pl.weglewski.praca_tydzien6.controller.AspectAfterAdd)")
    public void send() throws MessagingException {
        emailService.sendEmail(
                "yourmail@gmail.com",
                "Moja baza filmów",
                "Dodano nowy film");
    }
}