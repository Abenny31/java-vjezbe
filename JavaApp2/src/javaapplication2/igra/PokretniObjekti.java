package javaapplication2.igra;

import javaapplication2.jedinice.Brzina;
import javaapplication2.jedinice.Duzina;
import javaapplication2.jedinice.Kut;
import javaapplication2.jedinice.Lokacija;
import javaapplication2.jedinice.Vrijeme;

public abstract class PokretniObjekti extends Objekti {

    private Brzina brzina;
    private Kut kut;

    public PokretniObjekti(Lokacija lokacija, String slika, Brzina brzina,Kut kut) {
        super(lokacija, slika);
        this.brzina = brzina;
        this.kut=kut;
        
    }

    public Brzina getBrzina() {
        return brzina;
    }

    public Kut getKut() {
        return kut;
    }
    
    public void move (Vrijeme vrijeme){
        Duzina duzinaPuta= brzina.predeniPut(vrijeme);
        getLokacija().move(kut,duzinaPuta);
    }
}
