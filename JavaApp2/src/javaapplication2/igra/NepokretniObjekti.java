package javaapplication2.igra;

import javaapplication2.jedinice.Lokacija;

public class NepokretniObjekti extends Objekti{
 private String ime;

    public NepokretniObjekti(Lokacija lokacija, String slika, String ime) {
        super(lokacija, slika);
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }
 
 
}
