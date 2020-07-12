package testemonico.repository;

import testemonico.domain.entity.Location;
import testemonico.usecase.port.LocationRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryLocationRepository extends AbstractInMemoryRepository<Location, String> implements LocationRepository {

    @Override
    public List<Location> findByApproximateName(String name) {
        return this.database.values().stream().filter(l -> l.getName().contains(name)).collect(Collectors.toList());
    }
}
