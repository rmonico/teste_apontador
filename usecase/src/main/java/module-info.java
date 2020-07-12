module testemonico.usecase {
    requires testemonico.domain;

    exports testemonico.usecase.port;
    exports testemonico.usecase.customer.crud;
    exports testemonico.usecase.product.crud;
    exports testemonico.usecase.order.crud;
    exports testemonico.usecase.base.crud;
}
