module testemonico.controller {
    requires lombok;
    requires testemonico.usecase;
    requires testemonico.domain;

    exports testemonico.controller.product;
    exports testemonico.controller.product.model;
    exports testemonico.controller.customer;
    exports testemonico.controller.order;
    exports testemonico.controller;
    exports testemonico.controller.customer.model;
    exports testemonico.controller.order.model;
}