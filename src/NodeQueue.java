public class NodeQueue<E> {

        private NodeQueue<E> nachfolger;
        private E content;

        public NodeQueue(E pContent){
            content=pContent;
        }

        /*
        setzt den mit dem Parameter gegebenen NodeQueuen an die letzte Stelle
         */
        public void setNextNodeQueue(NodeQueue<E> pNodeQueue){
            nachfolger=pNodeQueue;
        }

        /*
        gib den nachfolgenden NodeQueuen zurück
         */
        public NodeQueue<E> getNextNodeQueue(){return nachfolger;}

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

