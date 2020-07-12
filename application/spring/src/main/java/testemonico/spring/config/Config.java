package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import testemonico.config.SpringConfig;
import testemonico.controller.customer.LocationController;

@Configuration
public class Config {

    private final SpringConfig config = new SpringConfig();

    @Bean
    public LocationController locationController() {
        return new LocationController(config.createLocation(),
                config.updateLocation(),
                config.deleteLocation(),
                config.findAllLocations(),
                config.findLocationById(),
                config.findLocationByApproximateName());
    }

}
