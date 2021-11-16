module com.sau.fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.sau.db;


    opens com.sau.db.fx to javafx.fxml;
    exports com.sau.db.fx;
}