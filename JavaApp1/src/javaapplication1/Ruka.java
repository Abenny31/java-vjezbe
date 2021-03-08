package javaapplication1;

public class Ruka {
    public enum Stanje{Savijena, Ispruzena};
    private Stanje stanje = Stanje.Ispruzena;
    
    public void savij (){
        stanje = Stanje.Savijena;
        
    }
    public void ispruzi (){
        stanje =Stanje.Ispruzena;
        
    }
    public Stanje getStanje(){
        return stanje;
    }
    public boolean jeSavijena(){
        return stanje == Stanje.Savijena;
    }
    public boolean jeIspruzena(){
        return stanje == Stanje.Ispruzena;
        
    }
}
