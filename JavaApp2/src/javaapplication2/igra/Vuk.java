package javaapplication2.igra;

import javaapplication2.jedinice.Brzina;
import javaapplication2.jedinice.Kut;
import javaapplication2.jedinice.Lokacija;

public class Vuk extends Neprijatelj
{
    private String boja;

    public Vuk(Lokacija lokacija, String slika, Brzina brzina, String boja) {
        super(lokacija, slika, brzina);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }

    

}
