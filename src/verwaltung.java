import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;

    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1]TicTacTo");
            System.out.println("[2]Wortkette");
            int verschluesselungprinzip = scanner.nextInt();
            if(verschluesselungprinzip==1) {

            }else if (verschluesselungprinzip==2){

            }

        }
    }
}
