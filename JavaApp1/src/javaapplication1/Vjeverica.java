package javaapplication1;


public class Vjeverica {
    private String ime;
    private String boja;
    private Ruka lijevaRuka;
    private Ruka desnaRuka;
    private String staDrzi;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Vjeverica(String ime, String boja) {
        this.setIme(ime);
        this.setBoja(boja);
        this.lijevaRuka = new Ruka();
        this.desnaRuka=new Ruka();
        this.staDrzi="nista" ;
    }

    public String getIme() {
        return ime;
    }

    public String getBoja() {
        return boja;
    }

    public String getStaDrzi() {
        return staDrzi;
    }
 
    public void savijajLijevuRuku(){
        lijevaRuka.savij();
        System.out.println(ime+" je savila lijevu ruku");
               
    }
    public void savijajDesnuRuku(){
        desnaRuka.savij();
        System.out.println(ime+" je savila desnu ruku");
    }
    private void provjeriMozeLiDrzati (Ruka ruka){
        if (ruka.jeIspruzena()){
            System.out.println(ime + " je ispustila " + staDrzi);
            staDrzi="nista";
        }
    }
    public void ispruziLijevuRuku(){
        lijevaRuka.ispruzi( );
        System.out.println(ime+" je ispruzila lijevu ruku");
        provjeriMozeLiDrzati(desnaRuka);
    }
    public void ispruziDesnuRuku(){
        desnaRuka.ispruzi();
        System.out.println(ime+" je ispruzila desnu ruku");
        provjeriMozeLiDrzati(lijevaRuka);
    }
    
    public void pridrzi(String sta){
        if(lijevaRuka.jeSavijena()|| desnaRuka.jeSavijena()){
            staDrzi = sta;
            System.out.println(ime+": pridrzava " + sta);
        }
        else{
            System.out.println(ime+": pridrzava " + sta);
        }
    }
    
   private String vjevericaObeIspruzene(){ 
       return "       |\\_/|\n" +
              "      ( ^ ^ )\n" +
              "    ___\\ Y /___  ___\n" +
              "   O___     ___O/   |\n" +
              "       \\   /   / __/\n" +
              "       /   \\  / /\n" +
              "      / /\\\\ \\__/\n" +
              "    /__/   \\__\\\n"; 
   }
   
   private String vjevericaDesanaSavijena(){
       return "       |\\_/|\n" +
              "      ( ^ ^ )\n" +
              "      _\\ Y /___  ___\n" +
              "     /      ___O/   |\n" +
              "     \\  \\@ /   / __/\n" +
              "      \\_/  \\__/ /\n" +
              "      / /\\\\ \\__/\n" +
              "    /__/   \\__\\"; 
   }
    
   private String vjevericaLijevaSavijena(){
       return "       |\\_/|\n" +
              "      ( ^ ^ )\n" +
              "    ___\\ Y /___  ___\n" +
              "   O___      \\  /   |\n" +
              "       \\ @/  / / __/\n" +
              "       /  \\_/_/ /\n" +
              "      / /\\\\ \\__/\n" +
              "    /__/   \\__\\"; 
   }
   
   private String vjevericaObeSavijene(){
       return "       |\\_/|\n" +
              "      ( ^ ^ )\n" +
              "       \\ Y /        \n" +
              "     /       \\  /   |\n" +
              "     \\  \\@/  / / __/\n" +
              "      \\ / \\_/ / /\n" +
              "      / /\\\\ \\__/\n" +
              "    /__/   \\__\\"; 
   }
   
   private String getVjevericaASCIIArt(){
       if (lijevaRuka.jeSavijena() && desnaRuka.jeSavijena()){
           return vjevericaObeSavijene();
       }
       if (lijevaRuka.jeSavijena()){
           return vjevericaLijevaSavijena();
       }
       if (desnaRuka.jeSavijena()){
           return vjevericaDesanaSavijena();
       }
       return vjevericaObeIspruzene();
   }
   @Override
   public String toString(){
       String vjevericaASCII=getVjevericaASCIIArt();
       
       if(staDrzi.equals("nista")){
           vjevericaASCII = vjevericaASCII.replace("@", " ");
       }
       return vjevericaASCII;
   }
}
