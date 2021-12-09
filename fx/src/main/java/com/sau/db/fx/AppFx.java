package com.sau.db.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppFx.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 776, 411);
        stage.setTitle("EKOS: Efektif Kütüphane Otomasyon Sistemi ==CEYHUN EREN==");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}