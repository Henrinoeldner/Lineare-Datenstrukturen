public class Kunde {
    private String name;

    public Kunde(){}
    public Kunde(String pName){
        name=pName;
    }
    /*
    setzt den Namen auf den Parameter
     */
    public void setName(String pName){name=pName;}

    /*
    gibt den Namen des Kunden zurueck
     */
    public String getName() {
        return name;
    }
}
