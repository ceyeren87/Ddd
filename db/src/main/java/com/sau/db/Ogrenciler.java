package com.sau.db;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ogrenciler {
    private Integer ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;

    @Id
    @Column(name = "ogrenci_no", nullable = false)
    public Integer getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(Integer ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Basic
    @Column(name = "ogrenci_ad", nullable = false, length = 45)
    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    @Basic
    @Column(name = "ogrenci_soyad", nullable = false, length = 45)
    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ogrenciler that = (Ogrenciler) o;

        if (ogrenciNo != null ? !ogrenciNo.equals(that.ogrenciNo) : that.ogrenciNo != null) return false;
        if (ogrenciAd != null ? !ogrenciAd.equals(that.ogrenciAd) : that.ogrenciAd != null) return false;
        if (ogrenciSoyad != null ? !ogrenciSoyad.equals(that.ogrenciSoyad) : that.ogrenciSoyad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ogrenciNo != null ? ogrenciNo.hashCode() : 0;
        result = 31 * result + (ogrenciAd != null ? ogrenciAd.hashCode() : 0);
        result = 31 * result + (ogrenciSoyad != null ? ogrenciSoyad.hashCode() : 0);
        return result;
    }
}
