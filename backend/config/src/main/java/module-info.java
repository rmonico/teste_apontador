module testemonico.config {
    requires testemonico.repository.in.memory;
    requires testemonico.usecase;
    requires testemonico.idgenerator.uuid;

    exports testemonico.config;
}