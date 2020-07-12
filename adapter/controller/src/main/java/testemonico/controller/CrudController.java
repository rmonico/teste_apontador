package testemonico.controller;

import testemonico.domain.entity.Entity;
import testemonico.usecase.base.crud.CreateEntityUseCase;
import testemonico.usecase.base.crud.DeleteEntityUseCase;
import testemonico.usecase.base.crud.FindAllEntities;
import testemonico.usecase.base.crud.UpdateEntityUseCase;
import testemonico.usecase.base.crud.FindEntityByIdUsecase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class CrudController<Rq, Rs, E extends Entity<I>, I> {

    private final Function<Rq, E> requestToModelConverter;
    private final Function<E, Rs> modelToResponseConverter;
    protected final CreateEntityUseCase<E> createEntityUseCase;
    protected final UpdateEntityUseCase<E> updateEntityUseCase;
    protected final DeleteEntityUseCase<E, I> deleteEntityUseCase;
    protected final FindAllEntities<E> findAllEntitiesUseCase;
    protected final FindEntityByIdUsecase<E, I> findEntityByIdUseCase;

    public CrudController(Function<Rq, E> requestToModelConverter,
                          Function<E, Rs> modelToResponseConverter,
                          CreateEntityUseCase<E> createEntityUseCase,
                          UpdateEntityUseCase<E> updateEntityUseCase,
                          DeleteEntityUseCase<E, I> deleteEntityUseCase,
                          FindAllEntities<E> findAllEntitiesUseCase,
                          FindEntityByIdUsecase<E, I> findEntityByIdUseCase) {
        this.requestToModelConverter = requestToModelConverter;
        this.modelToResponseConverter = modelToResponseConverter;
        this.createEntityUseCase = createEntityUseCase;
        this.updateEntityUseCase = updateEntityUseCase;
        this.deleteEntityUseCase = deleteEntityUseCase;
        this.findAllEntitiesUseCase = findAllEntitiesUseCase;
        this.findEntityByIdUseCase = findEntityByIdUseCase;
    }

    public Rs createEntity(Rq request) {
        var initialEntity = this.requestToModelConverter.apply(request);

        var entity = this.createEntityUseCase.create(initialEntity);

        return this.modelToResponseConverter.apply(entity);
    }

    public Rs updateEntity(Rq request) {
        var initialEntity = this.requestToModelConverter.apply(request);

        var entity = this.updateEntityUseCase.update(initialEntity);

        return this.modelToResponseConverter.apply(entity);
    }

    public Rs deleteEntity(I id) {
        var entity = this.deleteEntityUseCase.delete(id);

        return this.modelToResponseConverter.apply(entity);
    }

    public List<Rs> findAllEntities() {
        List<E> allEntities = this.findAllEntitiesUseCase.findAll();

        return allEntities.stream().map(this.modelToResponseConverter).collect(Collectors.toList());
    }

    public Rs findEntityById(I id) {
        var entity = this.findEntityByIdUseCase.findById(id).orElseThrow(() -> new RuntimeException(format("Entity not found (%s)", id)));

        return this.modelToResponseConverter.apply(entity);
    }

}
