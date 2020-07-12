package testemonico.usecase.location.crud;

import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.AbstractDeleteEntity;
import testemonico.usecase.port.LocationRepository;

public class DeleteLocation extends AbstractDeleteEntity<Location, String, LocationRepository> {

    public DeleteLocation(LocationRepository repository) {
        super(repository);
    }
}

