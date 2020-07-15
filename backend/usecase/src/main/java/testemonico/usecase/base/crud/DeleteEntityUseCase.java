package testemonico.usecase.base.crud;

import testemonico.domain.entity.Entity;

public interface DeleteEntityUseCase<E extends Entity<I>, I> {
    E delete(I id);
}
