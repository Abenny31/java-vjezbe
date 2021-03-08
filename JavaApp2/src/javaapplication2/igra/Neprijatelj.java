package javaapplication2.igra;

import javaapplication2.jedinice.Brzina;
import javaapplication2.jedinice.Kut;
import javaapplication2.jedinice.Lokacija;

public abstract class Neprijatelj extends PokretniObjekti{
    private double snaga = 0;
    private double zivot = 0;

    public Neprijatelj(Lokacija lokacija, String slika, Brzina brzina) {
        super(lokacija, slika, brzina,Kut.fromDegrees(0));
    }

    public double getSnaga() {
        return snaga;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    public double getZivot() {
        return zivot;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }
    
    
    
    
}
