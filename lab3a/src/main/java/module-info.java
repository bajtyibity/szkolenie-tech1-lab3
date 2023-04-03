module com.mycompany.lab3a {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.lab3a to javafx.fxml;
    exports com.mycompany.lab3a;
}
