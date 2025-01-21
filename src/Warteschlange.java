public class Warteschlange<E> {
    private Node<E> erster;
    private Node<E> letzter;

    public Warteschlange(){}
/*
gibt den Content des ersten Noden zurueck
 */
    public E gibErsten(){
        return erster.getContent();
    }

    /*entfernt das erste Element in der Warteschlange und speichert das Zweite als Erstes in erster ab
     */
    public void remove(){
        if(erster!=null) {
            if (erster.getNextNode()==null){
                erster.setContent(null);
              erster=null;
            }else {
                Node<E> speicher;
                speicher = erster.getNextNode();
                erster.setContent(null);
                erster.setNextNode(null);
                erster = speicher;
            }
        }
    }
/*
Erschafft ein Knoten fuer den mitgegebenen Parameter und speicher diesen an der Letzt stelle der Warteschlange
 */
    public void add(E content){
        Node<E> speicher= new Node<>(content);

        if (erster==null){
            erster=speicher;
        }else{
            letzter.setNextNode(speicher);
        }
        letzter=speicher;
    }
    /*
    gibt wahr zurueck, wenn kein Node gespeichert ist
     */
    public boolean gibLeer(){
        return erster == null;
    }

}
