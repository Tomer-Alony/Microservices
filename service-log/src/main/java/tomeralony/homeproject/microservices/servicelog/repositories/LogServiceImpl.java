package tomeralony.homeproject.microservices.servicelog.repositories;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tomeralony.homeproject.microservices.servicelog.services.LogService;

import java.time.Instant;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private Logger logger;

    @Override
    public void Log(String requestURI, String remoteUser, String method) {
        logger.info(String.format("Method:%s, Request URL: %s, From: %s, Time: %s",
                method, requestURI, remoteUser, Instant.now()));
    }
}
