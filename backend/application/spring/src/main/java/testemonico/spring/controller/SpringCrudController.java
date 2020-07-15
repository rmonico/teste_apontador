package testemonico.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testemonico.controller.CrudController;
import testemonico.domain.entity.Entity;

import java.util.List;

// TODO Fix returned status codes for all methods
public class SpringCrudController<C extends CrudController<Rq, Rs, M, I>, Rq, Rs, M extends Entity<I>, I> {

    protected final C domainController;

    public SpringCrudController(C domainController) {
        this.domainController = domainController;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Rq request) {
        Rs response = domainController.createEntity(request);

        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Rq request) {
        Rs response = domainController.updateEntity(request);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") I id) {
        Rs response = domainController.deleteEntity(id);

        return ResponseEntity.ok(response);
    }

    // TODO Paging
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<Rs> response = domainController.findAllEntities();

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findProductById(@PathVariable("id") I id) {
        Rs response = domainController.findEntityById(id);

        return ResponseEntity.ok(response);
    }
}
