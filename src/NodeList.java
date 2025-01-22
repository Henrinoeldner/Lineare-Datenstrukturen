public class NodeList<E> {

        private NodeList<E> nachfolger;
        private E content;

        public NodeList(E pContent){
            content=pContent;
        }

        /*
        setzt den mit dem Parameter gegebenen NodeQueuen an die letzte Stelle
         */
        public void setNext(NodeList<E> pNodeQueue){
            nachfolger=pNodeQueue;
        }

        /*
        gib den nachfolgenden NodeQueuen zurück
         */
        public NodeList<E> getNext(){return nachfolger;}

        /*
        setzt den Namen auf den Parameter
         */
        public void setContent(E pContent){content=pContent;}

        /*
        gibt den Namen des NodeQueuen zurueck
         */
        public E getContent() {
            return content;
        }
    }

