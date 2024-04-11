module org.example.comp228lab6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.comp228lab6 to javafx.fxml;
    exports org.example.comp228lab6;
}