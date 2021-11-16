module com.sau.fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sau.fx to javafx.fxml;
    exports com.sau.fx;
}