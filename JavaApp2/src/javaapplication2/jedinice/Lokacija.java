package javaapplication2.jedinice;

public class Lokacija {
    private Duzina x,y;

public Lokacija(Duzina x, Duzina y){
    this.x = x;
    this.y = y;
}    

    public Duzina getX() {
        return x;
    }

    public Duzina getY() {
        return y;
    }
    public void move(Kut kut, Duzina duzina){
       x.addMeters(duzina.toMeters() * Math.cos(kut.toRadians()));
        y.addMeters(duzina.toMeters() * Math.sin(kut.toRadians()));
    }

}
