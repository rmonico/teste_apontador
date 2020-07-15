package testemonico.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testemonico.controller.location.LocationController;
import testemonico.controller.location.model.LocationDTO;
import testemonico.domain.entity.Location;

import java.util.List;

@RestController()
@RequestMapping("/api/v1/location")
public class SpringLocationController extends SpringCrudController<LocationController, LocationDTO, LocationDTO, Location, String> {

    private final LocationController locationController;

    @Autowired
    public SpringLocationController(LocationController locationController) {
        super(locationController);
        this.locationController = locationController;
    }

    @GetMapping("/findByApproximateName")
    public ResponseEntity<?> findByApproximateName(@PathVariable("name") String name) {
        List<LocationDTO> response = locationController.findByApproximateName(name);

        return ResponseEntity.ok(response);
    }
}
