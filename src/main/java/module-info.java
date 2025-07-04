module com.oussama.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.oussama.demo to javafx.fxml;
    exports com.oussama.demo;
}