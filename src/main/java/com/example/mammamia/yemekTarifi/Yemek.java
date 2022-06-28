package com.example.mammamia.yemekTarifi;

import javax.persistence.*;

@Entity
@Table
public class Yemek {




    public Yemek(){

    }
    public Yemek(String ad, String aciklama, String yemek_kalori, String resim, String malzemeler, String sef_ismi, Integer id) {
        this.ad = ad;
        this.aciklama = aciklama;
        this.yemek_kalori = yemek_kalori;
        this.resim = resim;
        this.malzemeler = malzemeler;
        this.sef_ismi = sef_ismi;
        this.id = id;
    }






    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getYemek_kalori() {
        return yemek_kalori;
    }

    public void setYemek_kalori(String yemek_kalori) {
        this.yemek_kalori = yemek_kalori;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(String malzemeler) {
        this.malzemeler = malzemeler;
    }

    public String getSef_ismi() {
        return sef_ismi;
    }

    public void setSef_ismi(String sef_ismi) {
        this.sef_ismi = sef_ismi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @SequenceGenerator(
            name = "yemek_sequence",
            sequenceName = "yemek_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "yemek_sequence"
    )
    @Id
    private Integer id;
    private String ad, aciklama, yemek_kalori, resim, malzemeler, sef_ismi;



}
