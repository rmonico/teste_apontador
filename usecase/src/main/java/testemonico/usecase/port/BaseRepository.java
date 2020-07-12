package testemonico.usecase.port;

import testemonico.domain.entity.Entity;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<E extends Entity<I>, I> {

    E create(E entity);

    E update(E entity);

    E delete(I entity);

    Optional<E> findById(I id);

    List<E> findAll();
}
