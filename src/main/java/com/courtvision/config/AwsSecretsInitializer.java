package com.courtvision.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;

import java.util.Map;

public class AwsSecretsInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        try {
            String secretName = "courtvision/backend/env";
            Region region = Region.US_EAST_1;

            SecretsManagerClient client = SecretsManagerClient.builder()
                    .region(region)
                    .credentialsProvider(DefaultCredentialsProvider.create())
                    .build();

            GetSecretValueRequest request = GetSecretValueRequest.builder()
                    .secretId(secretName)
                    .build();

            String secretJson = client.getSecretValue(request).secretString();

            Map<String, Object> secrets = new ObjectMapper().readValue(secretJson, Map.class);

            context.getEnvironment().getPropertySources().addFirst(new MapPropertySource("awsSecrets", secrets));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load secrets from AWS Secrets Manager", e);
        }
    }
}
