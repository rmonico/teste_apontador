module testemonico.controller {
    requires lombok;
    requires testemonico.usecase;
    requires testemonico.domain;

    exports testemonico.controller.location;
    exports testemonico.controller;
    exports testemonico.controller.location.model;
}