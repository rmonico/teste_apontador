package testemonico.usecase.port;

import testemonico.domain.entity.Location;

import java.util.List;

public interface LocationRepository extends BaseRepository<Location, String> {
    List<Location> findByApproximateName(String name);
}
