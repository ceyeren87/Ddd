package com.sau.db.fx;

import com.sau.db.AppDb;
import com.sau.db.Kitap;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {

    private Timer t;

    @FXML
    private Button btnArama;

    @FXML
    private Button btnKapat;

    @FXML
    private Button btnKayit;

    @FXML
    private Button btnSag;

    @FXML
    private Button btnSol;

    @FXML
    private Label lblKitap;

    @FXML
    private TextField txtAnahtarKelime;

    @FXML
    private TextField txtBasimYili;

    @FXML
    private TextField txtBaskiSayisi;

    @FXML
    private TextField txtBaslik;

    @FXML
    private TextField txtDurum;

    @FXML
    private TextField txtIsbnIssn;

    @FXML
    private TextField txtKitapNo;

    @FXML
    private TextField txtKitaplik;

    @FXML
    private TextField txtRaf;

    @FXML
    private TextField txtYayinEvi;

    @FXML
    private TextField txtYazar1;

    @FXML
    private TextField txtYazar2;

    @FXML
    private TextField txtYazar3;

    @FXML
    void Arama(ActionEvent event) {

        String kitap = txtKitapNo.getText();

        if(txtKitapNo.getText().trim().equals(""))
        {
            txtKitapNo.setText("");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Lütfen Kitap No Giriniz !!");
            alert.showAndWait();
            return;
        }
           if( txtKitapNo.getText().trim().equals("0")) {
               txtKitapNo.setText("");
               Alert alert = new Alert(Alert.AlertType.ERROR);
               alert.setContentText("Lütfen 0'Dan Büyük Rakam Giriniz");
               alert.showAndWait();
               return;
           }
        AppDb adb = new AppDb();
        Kitap st = adb.getir(Integer.parseInt(kitap));
        yazdir(st);
    }

    @FXML
    void Kayit(ActionEvent event) {

        AppDb adb = new AppDb();
        Kitap st = new Kitap();
        st.setKno(0);
        st.setBaslik(txtBaslik.getText());
        st.setYazar1(txtYazar1.getText());
        st.setYazar2(txtYazar2.getText());
        st.setYazar3(txtYazar3.getText());
        st.setYayinevi(txtYayinEvi.getText());
        st.setAnahtar(txtAnahtarKelime.getText());
        st.setIssn(txtIsbnIssn.getText());
        st.setBaski(Integer.parseInt(txtBaskiSayisi.getText()));
        st.setByil(txtBasimYili.getText());
        st.setDurum(txtDurum.getText());
        st.setKitaplik(Integer.parseInt(txtKitaplik.getText()));
        st.setRaf(Integer.parseInt(txtRaf.getText()));
        adb.insert(st);

    }

    @FXML
    void Sag(ActionEvent event) {
        String kitap = txtKitapNo.getText();
        int k = Integer.parseInt(kitap);

        if(k >=1){
            k++;
            txtKitapNo.setText(String.valueOf(k));

            AppDb adb = new AppDb();
            Kitap st = adb.getir(k);
            sil();
            yazdir(st);
        }
    }


    @FXML
    void Sol(ActionEvent event) {
        String kitap2 = txtKitapNo.getText();
        int k2 = Integer.parseInt(kitap2);

        if(k2 >=1){
            k2--;
            if(k2>0) {
                txtKitapNo.setText(String.valueOf(k2));

                AppDb adb = new AppDb();
                Kitap st = adb.getir(k2);
                sil();
                yazdir(st);
            }
            if(k2==0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Sıfıra Gidemezsiniz!!");
                alert.showAndWait();
                return;
            }
        }
    }

    @FXML
    void Kapat(ActionEvent event) {

        Platform.exit();
        System.exit(0);

    }

    private void yazdir(Kitap st) {
        txtBaslik.setText(st.getBaslik());
        txtYazar1.setText(st.getYazar1());
        txtYazar2.setText(st.getYazar2());
        txtYazar3.setText(st.getYazar3());
        txtYayinEvi.setText(st.getYayinevi());
        txtAnahtarKelime.setText(st.getAnahtar());
        txtIsbnIssn.setText(st.getIssn());
        txtBaskiSayisi.setText(String.valueOf(st.getBaski()));
        txtBasimYili.setText(String.valueOf(st.getByil()));
        txtDurum.setText(st.getDurum());
        txtKitaplik.setText(String.valueOf(st.getKitaplik()));
        txtRaf.setText(String.valueOf(st.getRaf()));
    }

    private void sil (){
        txtBaslik.setText("");
        txtYazar1.setText("");
        txtYazar2.setText("");
        txtYazar3.setText("");
        txtYayinEvi.setText("");
        txtAnahtarKelime.setText("");
        txtIsbnIssn.setText("");
        txtBaskiSayisi.setText("");
        txtBasimYili.setText("");
        txtDurum.setText("");
        txtKitaplik.setText("");
        txtRaf.setText("");
    }

}
