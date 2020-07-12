package testemonico.controller.customer;

import testemonico.controller.CrudController;
import testemonico.controller.customer.model.LocationDTO;
import testemonico.domain.entity.Location;
import testemonico.usecase.base.crud.*;
import testemonico.usecase.location.crud.FindLocationByApproximateName;

import java.util.List;
import java.util.stream.Collectors;

public class LocationController extends CrudController<LocationDTO, LocationDTO, Location, String> {

    private final FindLocationByApproximateName locationByApproximateName;

    public LocationController(CreateEntityUseCase<Location> createEntityUseCase,
                              UpdateEntityUseCase<Location> updateEntityUseCase,
                              DeleteEntityUseCase<Location, String> deleteEntityUseCase,
                              FindAllEntities<Location> findAllEntitiesUseCase,
                              FindEntityByIdUsecase<Location, String> findEntityByIdUseCase,
                              FindLocationByApproximateName locationByApproximateName) {
        super(LocationDTO::toModel, LocationDTO::new, createEntityUseCase, updateEntityUseCase, deleteEntityUseCase, findAllEntitiesUseCase, findEntityByIdUseCase);
        this.locationByApproximateName = locationByApproximateName;
    }

    public List<LocationDTO> findByApproximateName(String name) {
        List<Location> response = locationByApproximateName.findByApproximateName(name);

        return response.stream().map(this.modelToResponseConverter).collect(Collectors.toList());
    }
}
