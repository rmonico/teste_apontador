package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;
import testemonico.usecase.port.BaseRepository;

import java.util.List;

public class AbstractFindAllEntities<E extends Entity<I>, I, R extends BaseRepository<E, I>> implements FindAllEntities<E> {

    private final R repository;

    public AbstractFindAllEntities(R repository) {
        this.repository = repository;
    }

    public List<E> findAll() {
        return repository.findAll();
    }
}
