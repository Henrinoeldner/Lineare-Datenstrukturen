public class Node<E> {

        private Node<E> nachfolger;
        private E content;

        public Node(E pContent){
            content=pContent;
        }

        /*
        setzt den mit dem Parameter gegebenen Noden an die letzte Stelle
         */
        public void setNextNode(Node<E> pNode){
            nachfolger=pNode;
        }

        /*
        gib den nachfolgenden Noden zurück
         */
        public Node<E> getNextNode(){return nachfolger;}

        /*
        setzt den Namen auf den Parameter
         */
        public void setContent(E pContent){content=pContent;}

        /*
        gibt den Namen des Noden zurueck
         */
        public E getContent() {
            return content;
        }
    }

