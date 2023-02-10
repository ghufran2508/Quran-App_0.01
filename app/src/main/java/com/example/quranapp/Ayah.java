package com.example.quranapp;

public class Ayah {
    public int id;
    public int surah_id;
    public int ayah_no;
    public String arabicText;
    public String FatehMuhammadJalandrield;
    public String MehmoodulHassan;
    public String DrMohsinKhan;
    public String MuftiTaqiUsmani;
    public int raku_id;
    public int praku_id;
    public int para_id;

    public Ayah(int id, int surah_id, int ayah_no, String arabicText, String fatehMuhammadJalandrield, String mehmoodulHassan, String drMohsinKhan, String muftiTaqiUsmani, int raku_id, int praku_id, int para_id) {
        this.id = id;
        this.surah_id = surah_id;
        this.ayah_no = ayah_no;
        this.arabicText = arabicText;
        FatehMuhammadJalandrield = fatehMuhammadJalandrield;
        MehmoodulHassan = mehmoodulHassan;
        DrMohsinKhan = drMohsinKhan;
        MuftiTaqiUsmani = muftiTaqiUsmani;
        this.raku_id = raku_id;
        this.praku_id = praku_id;
        this.para_id = para_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSurah_id() {
        return surah_id;
    }

    public void setSurah_id(int surah_id) {
        this.surah_id = surah_id;
    }

    public int getAyah_no() {
        return ayah_no;
    }

    public void setAyah_no(int ayah_no) {
        this.ayah_no = ayah_no;
    }

    public String getArabicText() {
        return arabicText;
    }

    public void setArabicText(String arabicText) {
        this.arabicText = arabicText;
    }

    public String getFatehMuhammadJalandrield() {
        return FatehMuhammadJalandrield;
    }

    public void setFatehMuhammadJalandrield(String fatehMuhammadJalandrield) {
        FatehMuhammadJalandrield = fatehMuhammadJalandrield;
    }

    public String getMehmoodulHassan() {
        return MehmoodulHassan;
    }

    public void setMehmoodulHassan(String mehmoodulHassan) {
        MehmoodulHassan = mehmoodulHassan;
    }

    public String getDrMohsinKhan() {
        return DrMohsinKhan;
    }

    public void setDrMohsinKhan(String drMohsinKhan) {
        DrMohsinKhan = drMohsinKhan;
    }

    public String getMuftiTaqiUsmani() {
        return MuftiTaqiUsmani;
    }

    public void setMuftiTaqiUsmani(String muftiTaqiUsmani) {
        MuftiTaqiUsmani = muftiTaqiUsmani;
    }

    public int getRaku_id() {
        return raku_id;
    }

    public void setRaku_id(int raku_id) {
        this.raku_id = raku_id;
    }

    public int getPraku_id() {
        return praku_id;
    }

    public void setPraku_id(int praku_id) {
        this.praku_id = praku_id;
    }

    public int getPara_id() {
        return para_id;
    }

    public void setPara_id(int para_id) {
        this.para_id = para_id;
    }
}
