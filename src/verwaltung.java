import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        Warteschlange warteschlange= new Warteschlange();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]Hinzufuegen");
            System.out.println("[2]Ersten Auslesen");
            int option = scanner.nextInt();
            if(option==1) {
                System.out.println("Wie viele?");
                option = scanner.nextInt();
                for (int i=0;i<option;i++){
                    warteschlange.einfuegen(new Kunde(""+i));

                }
            }else if (option==2){
                System.out.println( warteschlange.gibErsten().getName());
                warteschlange.entfernen();
            }

        }
    }
}
