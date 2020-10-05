package tomeralony.homeproject.microservices.servicelog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tomeralony.homeproject.microservices.servicelog.DTO.RequestDTO;
import tomeralony.homeproject.microservices.servicelog.services.LogService;

@RestController
@RequestMapping("/api")
public class LogController {

    @Autowired
    private LogService logService;

    @PostMapping("/log")
    public void logRequest(@RequestBody RequestDTO request) {
        logService.Log(request.getRequestURI(), request.remoteHost(), request.getMethod());
    }
}
