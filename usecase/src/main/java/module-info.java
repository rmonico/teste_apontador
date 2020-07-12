module testemonico.usecase {
    requires testemonico.domain;

    exports testemonico.usecase.port;
    exports testemonico.usecase.location.crud;
    exports testemonico.usecase.base.crud;
}
