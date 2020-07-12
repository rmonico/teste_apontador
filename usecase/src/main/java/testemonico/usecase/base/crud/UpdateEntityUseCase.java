package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;

public interface UpdateEntityUseCase<E extends Entity<?>> {
    E update(E entity);
}
