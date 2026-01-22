module com.example.test_film {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_film to javafx.fxml;
    exports com.example.test_film;
}