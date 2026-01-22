package com.example.test_film;

public class Film {

    private String nazev;
    private String reziser;
    private int rokVydani;

    public Film(String nazev,  String reziser, int rokVydani) {
        this.nazev = nazev;
        this.reziser = reziser;
        this.rokVydani = rokVydani;
    }

    public String getNazev() {
        return nazev;
    }

    public String getReziser() {
        return reziser;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }

    public String toString(){
        return nazev;
    }
}
