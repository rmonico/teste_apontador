package testemonico.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import testemonico.config.SpringConfig;
import testemonico.controller.location.LocationController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200");
            }
        };
    }

}
