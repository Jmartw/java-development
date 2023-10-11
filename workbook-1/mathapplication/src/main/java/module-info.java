module com.pluralsight.mathapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pluralsight.mathapplication to javafx.fxml;
    exports com.pluralsight.mathapplication;
}