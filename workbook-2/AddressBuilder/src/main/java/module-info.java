module com.example.addressbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pluralsight to javafx.fxml;
    exports com.pluralsight;
}