package br.com.ldf.medium.app;

import br.com.ldf.medium.ApiClient;
import br.com.ldf.medium.integration.HousesApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WizardWorldIntegrationConfig {

    private final String wizardWorldBasePath;

    public WizardWorldIntegrationConfig(@Value("${wizard-world.base-path}") String wizardWorldBasePath) {
        this.wizardWorldBasePath = wizardWorldBasePath;
    }

    @Bean
    public HousesApi housesApi() {
        return new HousesApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        var apiClient = new ApiClient();
        apiClient.setBasePath(wizardWorldBasePath);
        return apiClient;
    }
}
