package javaapplication2;

import java.util.LinkedList;
import java.util.List;
import javaapplication2.igra.Igrac;
import javaapplication2.igra.NepokretniObjekti;
import javaapplication2.igra.Objekti;
import javaapplication2.igra.Vuk;
import javaapplication2.jedinice.Vrijeme;
import javaapplication2.jedinice.Brzina;
import javaapplication2.jedinice.Duzina;
import javaapplication2.jedinice.Lokacija;


public class JavaApplication2 {


    public static void main(String[] args) {
      List<Objekti> listaObjekataIgre = new LinkedList<>();
      
      
      
        Vuk v1 = new Vuk(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(12)
                )
                ,"slike/vuk.png",
                Brzina.fromKilometersPerHour(40),
                "crna"
                );
                Vuk v2 = new Vuk(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(13)
                )
                ,"slike/vuk.png",
                Brzina.fromKilometersPerHour(45),
                "siva"
                );
                
         
      
      listaObjekataIgre.add(v1);
      listaObjekataIgre.add(v2);
      
        System.out.println(listaObjekataIgre.size());
      v1.move(Vrijeme.fromMinutes(2));
      v2.move(Vrijeme.fromMinutes(2));
        System.out.println(listaObjekataIgre.size());
}

    
}
