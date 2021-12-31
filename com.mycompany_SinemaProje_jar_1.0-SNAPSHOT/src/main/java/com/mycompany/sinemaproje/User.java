package com.mycompany.sinemaproje;

public class User {

    private String Film_adi;
    private String Suresi;
    private String Cikis_yili;
    private String Basroller;
    private String Yayin_tarihi_saati;
    private String Turu;

    public User(String Film_adi, String Suresi, String Cikis_yili, String Basroller, String Yayin_tarihi_saati, String Turu) {
        this.Film_adi = Film_adi;
        this.Suresi = Suresi;
        this.Cikis_yili = Cikis_yili;
        this.Basroller = Basroller;
        this.Yayin_tarihi_saati = Yayin_tarihi_saati;
        this.Turu = Turu;
    }
    
    public String getFilm_adi(){
        return Film_adi;
    }
    public String getSuresi(){
        return Suresi;
    }
    public String getCikis_yili(){
        return Cikis_yili;
    }
    public String getBasroller(){
        return Basroller;
    }
    public String getYayin_tarihi_saati(){
        return Yayin_tarihi_saati;
    }
    public String getTuru(){
        return Turu;
    }

}
