package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;

import java.util.Optional;

public interface FindEntityByIdUsecase<E extends Entity<I>, I> {

    Optional<E> findById(I id);
}
