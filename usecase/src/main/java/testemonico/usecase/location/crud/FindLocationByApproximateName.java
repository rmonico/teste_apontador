package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.port.LocationRepository;

import java.util.List;

public class FindLocationByApproximateName {

    private final LocationRepository locationRepository;

    public FindLocationByApproximateName(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> findByApproximateName(String name) {
        return locationRepository.findByApproximateName(name);
    }
}
