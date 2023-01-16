package com.example.randomloggersvc.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomLoggerResource {

    private static final Logger logger = LoggerFactory.getLogger(RandomLoggerResource.class);

    private Random random = new Random();

    @Scheduled(fixedRate = 1000)
    public void logRandomMessage() {
        int randomInt = random.nextInt();
        String randomMessage = "Generating a Random integer every 1000 milliseconds (1 second): " + randomInt;
        logger.info(randomMessage);
    }
}
