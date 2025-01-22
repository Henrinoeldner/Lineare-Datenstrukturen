public class NodeStack<E> {

        private NodeStack<E> nachfolger;
        private E content;

        public NodeStack(E pContent){
            content=pContent;
        }

        /*
        setzt den mit dem Parameter gegebenen NodeQueuen an die letzte Stelle
         */
        public void setNextNodeStack(NodeStack<E> pNodeQueue){
            nachfolger=pNodeQueue;
        }

        /*
        gib den nachfolgenden NodeQueuen zurück
         */
        public NodeStack<E> getNextNodeStack(){return nachfolger;}

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

