module com.example.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaproject2 to javafx.fxml;
    exports com.example.javaproject2;
    exports com.example.javaproject2.week01.day3;
    opens com.example.javaproject2.week01.day3 to javafx.fxml;
}