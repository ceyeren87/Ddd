package com.sau.db;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Kitap {
    private Integer kno;
    private String baslik;
    private String yazar1;
    private String yazar2;
    private String yazar3;
    private String yayinevi;
    private String anahtar;
    private String issn;
    private Integer baski;
    private String byil;
    private String durum;
    private Integer kitaplik;
    private Integer raf;

    @Id
    @Column(name = "kno", nullable = false)
    public Integer getKno() {
        return kno;
    }

    public void setKno(Integer kno) {
        this.kno = kno;
    }

    @Basic
    @Column(name = "baslik", nullable = true, length = 256)
    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    @Basic
    @Column(name = "yazar1", nullable = true, length = 64)
    public String getYazar1() {
        return yazar1;
    }

    public void setYazar1(String yazar1) {
        this.yazar1 = yazar1;
    }

    @Basic
    @Column(name = "yazar2", nullable = true, length = 64)
    public String getYazar2() {
        return yazar2;
    }

    public void setYazar2(String yazar2) {
        this.yazar2 = yazar2;
    }

    @Basic
    @Column(name = "yazar3", nullable = true, length = 64)
    public String getYazar3() {
        return yazar3;
    }

    public void setYazar3(String yazar3) {
        this.yazar3 = yazar3;
    }

    @Basic
    @Column(name = "yayinevi", nullable = true, length = 128)
    public String getYayinevi() {
        return yayinevi;
    }

    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Basic
    @Column(name = "anahtar", nullable = true, length = 32)
    public String getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(String anahtar) {
        this.anahtar = anahtar;
    }

    @Basic
    @Column(name = "issn", nullable = true, length = 16)
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Basic
    @Column(name = "baski", nullable = true)
    public Integer getBaski() {
        return baski;
    }

    public void setBaski(Integer baski) {
        this.baski = baski;
    }

    @Basic
    @Column(name = "byil", nullable = true, length = 4)
    public String getByil() {
        return byil;
    }

    public void setByil(String byil) {
        this.byil = byil;
    }

    @Basic
    @Column(name = "durum", nullable = true, length = 10)
    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Basic
    @Column(name = "kitaplik", nullable = true)
    public Integer getKitaplik() {
        return kitaplik;
    }

    public void setKitaplik(Integer kitaplik) {
        this.kitaplik = kitaplik;
    }

    @Basic
    @Column(name = "raf", nullable = true)
    public Integer getRaf() {
        return raf;
    }

    public void setRaf(Integer raf) {
        this.raf = raf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kitap kitap = (Kitap) o;

        if (kno != null ? !kno.equals(kitap.kno) : kitap.kno != null) return false;
        if (baslik != null ? !baslik.equals(kitap.baslik) : kitap.baslik != null) return false;
        if (yazar1 != null ? !yazar1.equals(kitap.yazar1) : kitap.yazar1 != null) return false;
        if (yazar2 != null ? !yazar2.equals(kitap.yazar2) : kitap.yazar2 != null) return false;
        if (yazar3 != null ? !yazar3.equals(kitap.yazar3) : kitap.yazar3 != null) return false;
        if (yayinevi != null ? !yayinevi.equals(kitap.yayinevi) : kitap.yayinevi != null) return false;
        if (anahtar != null ? !anahtar.equals(kitap.anahtar) : kitap.anahtar != null) return false;
        if (issn != null ? !issn.equals(kitap.issn) : kitap.issn != null) return false;
        if (baski != null ? !baski.equals(kitap.baski) : kitap.baski != null) return false;
        if (byil != null ? !byil.equals(kitap.byil) : kitap.byil != null) return false;
        if (durum != null ? !durum.equals(kitap.durum) : kitap.durum != null) return false;
        if (kitaplik != null ? !kitaplik.equals(kitap.kitaplik) : kitap.kitaplik != null) return false;
        if (raf != null ? !raf.equals(kitap.raf) : kitap.raf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kno != null ? kno.hashCode() : 0;
        result = 31 * result + (baslik != null ? baslik.hashCode() : 0);
        result = 31 * result + (yazar1 != null ? yazar1.hashCode() : 0);
        result = 31 * result + (yazar2 != null ? yazar2.hashCode() : 0);
        result = 31 * result + (yazar3 != null ? yazar3.hashCode() : 0);
        result = 31 * result + (yayinevi != null ? yayinevi.hashCode() : 0);
        result = 31 * result + (anahtar != null ? anahtar.hashCode() : 0);
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        result = 31 * result + (baski != null ? baski.hashCode() : 0);
        result = 31 * result + (byil != null ? byil.hashCode() : 0);
        result = 31 * result + (durum != null ? durum.hashCode() : 0);
        result = 31 * result + (kitaplik != null ? kitaplik.hashCode() : 0);
        result = 31 * result + (raf != null ? raf.hashCode() : 0);
        return result;
    }
}
