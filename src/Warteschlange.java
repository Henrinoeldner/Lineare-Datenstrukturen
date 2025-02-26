public class Warteschlange<E> {
    private NodeQueue<E> erster;
    private NodeQueue<E> letzter;

    public Warteschlange(){}
/*
gibt den Content des ersten NodeQueuen zurueck
 */
    public E gibErsten(){
        return erster.getContent();
    }

    /*entfernt das erste Element in der Warteschlange und speichert das Zweite als Erstes in erster ab
     */
    public void remove(){
        if(erster!=null) {
            if (erster.getNextNodeQueue()==null){
                erster.setContent(null);
              erster=null;
            }else {
                NodeQueue<E> speicher;
                speicher = erster.getNextNodeQueue();
                erster.setContent(null);
                erster.setNextNodeQueue(null);
                erster = speicher;
            }
        }
    }
/*
Erschafft ein Knoten fuer den mitgegebenen Parameter und speicher diesen an der Letzt stelle der Warteschlange
 */
    public void add(E content){
        NodeQueue<E> speicher= new NodeQueue<>(content);

        if (erster==null){
            erster=speicher;
        }else{
            letzter.setNextNodeQueue(speicher);
        }
        letzter=speicher;
    }
    /*
    gibt wahr zurueck, wenn kein NodeQueue gespeichert ist
     */
    public boolean gibLeer(){
        return erster == null;
    }

}
