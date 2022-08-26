module com.example.countingcharacters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.countingcharacters to javafx.fxml;
    exports com.example.countingcharacters;
}