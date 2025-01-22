public class List<E> {
    private NodeList<E> erster;
    private NodeList<E> letzter;
    private NodeList<E> searchedElement;
    public List(){}
/**
*gibt den Content des NodeList an der Stelle des Parameters zurueck
*@param  pos
 */
    public E get(int pos){
        this.setSearched(pos);
        return searchedElement.getContent();
    }

    /**
     * Setzt den content an Stelle pos auf pContent
     * @param  pContent
     * @param  pos
     */
    public void set(E pContent, int pos){
        this.setSearched(pos);
        searchedElement.setContent(pContent);
    }

    /**
     * fuegt eine Note mit pContent an der Stelle pos hinzu
     * @param pContent
     * @param pos
     */
    public void add(E pContent, int pos){
        NodeList<E> speicher= new NodeList<>(pContent);
        this.setSearched(pos-1);
        speicher.setNext(searchedElement.getNext());
        searchedElement.setNext(speicher);
    }
    /**
     * entfernt das erste Element in der Warteschlange und speichert das Zweite als Erstes in erster ab
     * @param pos
     */
    public void remove(int pos){
       this.setSearched(pos+1);
       NodeList<E> speicher= searchedElement;
       this.setSearched(pos);
       searchedElement.setContent(null);
       searchedElement.setNext(null);
       this.setSearched(pos-1);
       searchedElement.setNext(speicher);
    }
/*
Erschafft ein Knoten fuer den mitgegebenen Parameter und speicher diesen an der Letzt stelle der Warteschlange
 */
    public void append(E content){
        NodeList<E> speicher= new NodeList<>(content);

        if (erster==null){
            erster=speicher;
        }else{
            letzter.setNext(speicher);
        }
        letzter=speicher;
    }

    public void setSearched(int pos){
        NodeList<E> tSearched= erster;
        for (int i=0;i<pos;i++){
            tSearched=tSearched.getNext();
        }

    }

    /*
    gibt wahr zurueck, wenn kein NodeStack gespeichert ist
     */
    public boolean gibLeer(){
        return erster == null;
    }

}
