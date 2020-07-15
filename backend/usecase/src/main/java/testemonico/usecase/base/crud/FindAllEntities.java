package testemonico.usecase.base.crud;

import java.util.List;

public interface FindAllEntities<E> {
    List<E> findAll();
}
