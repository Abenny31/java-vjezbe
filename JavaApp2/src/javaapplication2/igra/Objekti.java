package javaapplication2.igra;

import javaapplication2.jedinice.Lokacija;

public abstract class Objekti {
    private Lokacija lokacija;
    private String slika;

    public Objekti(Lokacija lokacija, String slika) {
        this.lokacija = lokacija;
        this.slika = slika;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public String getSpritePath() {
        return slika;
    }
    
    
    
    
}
