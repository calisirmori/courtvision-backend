package com.courtvision;

import com.courtvision.config.AwsSecretsInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourtVisionApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CourtVisionApplication.class);
        app.addInitializers(new AwsSecretsInitializer());
        app.run(args);
    }
}