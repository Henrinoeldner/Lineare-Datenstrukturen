public class Warteschlange {
    private Kunde erster;

    public Warteschlange(){};

    public Kunde gibErsten(){return erster;}

    public void entfernen(){
    Kunde speicher;
    speicher=erster.getNachfolger();
    erster=speicher;
    }

    public void einfuegen(Kunde pKunde){

        if (erster==null){
            erster=pKunde;
        }else{
            erster.setNachfolger(pKunde);
        }
    }
    public boolean gibLeer(){
        if (erster==null){
            return true;
        }else{
            return false;
        }
    }

}
