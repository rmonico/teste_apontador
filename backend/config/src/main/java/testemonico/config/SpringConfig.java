package testemonico.config;

import testemonico.repository.InMemoryLocationRepository;
import testemonico.usecase.location.crud.*;
import testemonico.usecase.port.IdGenerator;
import testemonico.usecase.port.LocationRepository;
import testemonico.uuid.UuidGenerator;

public class SpringConfig {
    private final LocationRepository locationRepository = new InMemoryLocationRepository();
    private final IdGenerator<String> idGenerator = new UuidGenerator<String>();

    public CreateLocation createLocation() {
        return new CreateLocation(locationRepository, idGenerator);
    }

    public UpdateLocation updateLocation() {
        return new UpdateLocation(locationRepository);
    }

    public DeleteLocation deleteLocation() {
        return new DeleteLocation(locationRepository);
    }

    public FindAllLocations findAllLocations() {
        return new FindAllLocations(locationRepository);
    }

    public FindLocationById findLocationById() {
        return new FindLocationById(locationRepository);
    }

    public FindLocationByApproximateName findLocationByApproximateName() { return new FindLocationByApproximateName(locationRepository); }

}
