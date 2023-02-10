package com.example.quranapp;

public class Surah {
    public int id;
    public String intro;
    public String englishname;
    public String nazool;
    public String urduName;

    public Surah(int id, String intro, String name, String nazool, String urduName) {
        this.id = id;
        this.intro = intro;
        this.englishname = name;
        this.nazool = nazool;
        this.urduName = urduName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getEnglishName() {
        return englishname;
    }

    public void setEnglishName(String name) {
        this.englishname = name;
    }

    public String getNazool() {
        return nazool;
    }

    public void setNazool(String nazool) {
        this.nazool = nazool;
    }

    public String getUrduName() {
        return urduName;
    }

    public void setUrduName(String urduName) {
        this.urduName = urduName;
    }
}
