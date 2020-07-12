package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;

public interface CreateEntityUseCase<E extends Entity<?>> {
    E create(E entity);
}
