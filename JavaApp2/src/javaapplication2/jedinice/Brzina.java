package javaapplication2.jedinice;

public class Brzina {

    private double mps;

    private Brzina(double mps){
    this.mps=mps;
}
    public static Brzina fromeMetersPerSecond(double mps){
        return new Brzina(mps);
    }
    public static Brzina fromKilometersPerHour(double kmph){
        return new Brzina(kmph/3.6);
    }
    public double toMetersPerSecond(){
        return this.mps;
    }
    public double toMKilometersPerHour(){
        return this.mps*3.6;
    }
    public void addMetersPerSecond (double mps){
        this.mps+=mps;
    }
    public void addKilometersPerHour (double kmph){
        this.mps+=kmph/3.6;
    }
    public void add(Brzina brzina){
        this.mps += brzina.toMetersPerSecond();
    }
    public Duzina predeniPut(Vrijeme vrijeme){
        return Duzina.fromMeters(this.mps+vrijeme.toSeconds());
    }

}
