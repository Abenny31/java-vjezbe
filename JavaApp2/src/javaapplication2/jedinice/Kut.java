package javaapplication2.jedinice;

public class Kut {
private double radijani;

    private Kut(double radijani) {
        this.radijani = radijani;
    }

    public static Kut fromRadians(double radijani){
        return new Kut(radijani);
    }
    
    public static Kut fromDegrees (double stupnjevi){
        return new Kut (stupnjevi*Math.PI/180.);
    }
    
    public double toRadians(){
        return radijani;
    }
    public double toDegrees(){
        return radijani*180/Math.PI;
    }
   
    public void rotateLeft (Kut kut){
        radijani = Math.toRadians(toDegrees() + kut.toDegrees());
    }
    public void rotateRight (Kut kut){
        radijani = Math.toRadians(toDegrees() - kut.toDegrees());
    }
}
