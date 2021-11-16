package com.sau.db.fx;

import com.sau.db.AppDb;
import com.sau.db.Ogrenciler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {


    @FXML
    private Label l1;

    @FXML
    protected void Getir() {

        AppDb adb = new AppDb();
        Ogrenciler st = adb.getir(1);
        l1.setText(st.getOgrenciAd());
    }
}