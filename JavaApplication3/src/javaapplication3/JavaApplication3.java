package javaapplication3;

import java.util.ArrayList;


public class JavaApplication3 {

    
    public static void main(String[] args) {
        
        
        ArrayList<Robot> roboti = new ArrayList<>();
        
        roboti.add(new AutoRobot(100, "Auto 1", "test332", 45));
        roboti.add(new LeteciRobot(2, "letelica", "test211", 600));
        roboti.add(new TajniRobot(300,"Super tajni robot", "12345"));
        
        for (Robot r:roboti){
            System.out.println("Tvoje ime? " +r.getIme());
            System.out.println("Tezina ti je? "+ r.getTezinaKG());
            
//        r.izvrsiNaredjenje("test332", "POKRENI SE");
//        r.izvrsiNaredjenje("test331", "ZAUSTAVI SE");
//        r.izvrsiNaredjenje("test211", "POKRENI SE");
//        r.izvrsiNaredjenje("test211", "ZAUSTAVI SE");
//        r.izvrsiNaredjenje("test211", "POLETI");
//        r.izvrsiNaredjenje("test211", "SLETI");
//                
    }
    }
}
