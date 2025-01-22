public class Stack<E> {
    private NodeStack<E> erster;
    public Stack(){}
/*
gibt den Content des ersten NodeStackn zurueck
 */
    public E gibErsten(){
        return erster.getContent();
    }

    /*entfernt das erste Element in der Warteschlange und speichert das Zweite als Erstes in erster ab
     */
    public void remove(){
        if(erster!=null) {
            if (erster.getNextNodeStack()==null){
                erster.setContent(null);
              erster=null;
            }else {
                NodeStack<E> speicher;
                speicher = erster.getNextNodeStack();
                erster.setContent(null);
                erster.setNextNodeStack(null);
                erster = speicher;
            }
        }
    }
/*
Erschafft ein Knoten fuer den mitgegebenen Parameter und speicher diesen an der Letzt stelle der Warteschlange
 */
    public void add(E content){
        NodeStack<E> speicher= new NodeStack<>(content);

        if (erster != null) {
            speicher.setNextNodeStack(erster);
        }
        erster=speicher;
    }
    /*
    gibt wahr zurueck, wenn kein NodeStack gespeichert ist
     */
    public boolean gibLeer(){
        return erster == null;
    }

}
