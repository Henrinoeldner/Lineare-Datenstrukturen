public class Kunde {
    private Kunde nachfolger;
    private String name;

    public Kunde(){}
    public Kunde(String pName){
        name=pName;
    }

    public void setNachfolger(Kunde pKunde){
        if (nachfolger==null){
            nachfolger=pKunde;
        }else{nachfolger.setNachfolger(pKunde);}
       };
    public Kunde getNachfolger(){return nachfolger;}

    public void setName(String pName){name=pName;}
    public String getName() {
        return name;
    }
}
