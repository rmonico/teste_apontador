package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;
import testemonico.usecase.port.BaseRepository;
import testemonico.usecase.port.IdGenerator;

public abstract class AbstractCreateEntity<E extends Entity<I>, I, R extends BaseRepository<E, I>> implements CreateEntityUseCase<E> {

    private final R repository;
    private final IdGenerator<I> idGenerator;

    public AbstractCreateEntity(R repository, IdGenerator<I> idGenerator) {
        this.repository = repository;
        this.idGenerator = idGenerator;
    }

    @SuppressWarnings("unchecked")
    public E create(E rawEntity) {
        E entity = (E) rawEntity.toBuilder()
                .id(this.idGenerator.generate())
                .build();

        return repository.create(entity);
    }
}
