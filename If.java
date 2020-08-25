import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int a = 0, b = 1;

        /*
            Hinter IF muss eine Bedingung angegeben werden.
            Ist diese Wahr wird der folgende Block ausgeführt,
            ist sie falsch wird das Programm nach dem IF fortgesetzt.
        */
        if (a < b) {
            System.out.println("Wahr");
        }

        /*
            Gibt es ein ELSE, so kann auch der Falsch-Fall abgefangen
            werden.
            Es wird immer nur ein Block ausgeführt
        */
        if (a > b) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Bitte geben Sie das Passwort ein: ");
        String passwort = s.nextLine();

        if (passwort.equals("1234")) {
            System.out.println("Richtiges Passwort! Willkommen!");
        } else {
            System.out.println("Alaaaaarm!");
        }
    }
}
