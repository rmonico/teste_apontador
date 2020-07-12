package testemonico.uuid;

import testemonico.usecase.port.IdGenerator;

import java.util.UUID;

public class UuidGenerator<I> implements IdGenerator<I> {

    @Override
    @SuppressWarnings("unchecked")
    public I generate() {
        try {
            return (I) UUID.randomUUID().toString();
        } catch (ClassCastException e) {
            throw new RuntimeException("Just String type parameter is supported by this implementation", e);
        }
    }
}
