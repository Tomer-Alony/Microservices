package tomeralony.homeproject.microservices.serviceshuffle.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomizedErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "error.html";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
