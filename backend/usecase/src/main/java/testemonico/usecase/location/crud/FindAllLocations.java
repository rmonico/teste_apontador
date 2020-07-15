package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.AbstractFindAllEntities;
import testemonico.usecase.port.LocationRepository;

public class FindAllLocations extends AbstractFindAllEntities<Location, String, LocationRepository> {

    public FindAllLocations(LocationRepository repository) {
        super(repository);
    }
}

