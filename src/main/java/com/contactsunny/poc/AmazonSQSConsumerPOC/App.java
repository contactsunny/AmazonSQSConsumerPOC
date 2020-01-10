package com.contactsunny.poc.AmazonSQSConsumerPOC;

import com.contactsunny.poc.AmazonSQSConsumerPOC.utils.SQSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private SQSUtil sqsUtil;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        sqsUtil.startListeningToMessages();
    }
}
