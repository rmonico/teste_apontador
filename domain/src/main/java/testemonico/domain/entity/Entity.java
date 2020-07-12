package testemonico.domain.entity;

import lombok.Data;

@Data
public abstract class Entity<I> {

    private I id;

    public abstract EntityBuilder toBuilder();

    public static abstract class EntityBuilder<I> {

        public abstract EntityBuilder<I> id(I id);

        public abstract Entity<I> build();
    }
}
