module com.example.mucjava231javafxbasic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mucjava231javafxbasic to javafx.fxml;
    exports com.example.mucjava231javafxbasic;
}