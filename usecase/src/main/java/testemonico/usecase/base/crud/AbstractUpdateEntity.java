package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;
import testemonico.usecase.port.BaseRepository;

public abstract class AbstractUpdateEntity<E extends Entity<I>, I, R extends BaseRepository<E, I>> implements UpdateEntityUseCase<E> {

    private final R repository;

    public AbstractUpdateEntity(R repository) {
        this.repository = repository;
    }

    public E update(E entity) {
        return repository.update(entity);
    }
}
