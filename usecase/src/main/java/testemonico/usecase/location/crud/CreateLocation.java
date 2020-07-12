package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.AbstractCreateEntity;
import testemonico.usecase.port.LocationRepository;
import testemonico.usecase.port.IdGenerator;

public class CreateLocation extends AbstractCreateEntity<Location, String, LocationRepository> {

    public CreateLocation(LocationRepository repository, IdGenerator<String> idGenerator) {
        super(repository, idGenerator);
    }
}

