package javaapplication3;

public class LeteciRobot extends Robot {
 private double masimalnaVisina;

    public LeteciRobot(double tezinaKG, String ime, String lozinka, double masimalnaVisina) {
     super(tezinaKG,ime,lozinka);
        this.masimalnaVisina = masimalnaVisina;
    }

    public double getMasimalnaVisina() {
        return masimalnaVisina;
    }

    @Override
     final public double getTezinaKG() {
        return super.getTezinaKG(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {
       if(naredjenje.equals("POLETI")){
        System.out.println(getIme() +" je poletio.");
       }
    else if (naredjenje.equals("SLETI")){
            System.out.println(getIme() +" je sletio.");
    }
    else{System.out.println(getIme() +" ne poznaje ovu naredbu.");
        }
}
}
