package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.AbstractUpdateEntity;
import testemonico.usecase.port.LocationRepository;

public class UpdateLocation extends AbstractUpdateEntity<Location, String, LocationRepository> {

    public UpdateLocation(LocationRepository repository) {
        super(repository);
    }
}

