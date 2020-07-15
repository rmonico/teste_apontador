package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.AbstractFindEntityById;
import testemonico.usecase.port.LocationRepository;

public class FindLocationById extends AbstractFindEntityById<Location, String, LocationRepository> {
    public FindLocationById(LocationRepository repository) {
        super(repository);
    }
}
