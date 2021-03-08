package javaapplication2.igra;

import javaapplication2.jedinice.Brzina;
import javaapplication2.jedinice.Kut;
import javaapplication2.jedinice.Lokacija;

public class Igrac extends PokretniObjekti {
    private String ime= "";
    private double snaga=0;
    private double zivot=0;

    public Igrac(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina,Kut.fromDegrees(0));
        
    }

    public String getIme() {
        return ime;
    }

    public double getSnaga() {
        return snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }
    
    

}
