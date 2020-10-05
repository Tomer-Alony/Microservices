package tomeralony.homeproject.microservices.servicelog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tomeralony.homeproject.microservices.servicelog.repositories.LogServiceImpl;

// Configuration to decouple logger from action (controller), easy to replace the logger type from here
@Configuration
public class LogConfiguration {
    @Bean
    public Logger log() {
        return LoggerFactory.getLogger(LogServiceImpl.class);
    }
}
