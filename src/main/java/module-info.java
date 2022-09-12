module com.example.llesson1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.llesson1 to javafx.fxml;
    exports com.example.llesson1;
}