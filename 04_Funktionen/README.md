# Funktionen
Mit Hilfe von Funktionen können Programme in kleinere, wiederverwertbare Einheiten unterteilt werden.

## Funktionsdefinition
```JAVA
    static [Datentyp] [Funktionsname]([Liste der formalen Paramter]) {
        [Funktionsinhalt]
    }
```

### Beispiel
```JAVA
    static int doppelt(int zahl) {
        return 2 * zahl;
    }

    // ...
    int i = 1234567;
    System.out.println("Das Doppelte von " + i + " ist " + doppelt(i));
    // Ausgabe: "Das Doppelte von 1234567 ist 2469134"
```

## Nochmal der Kurzschluß
```JAVA
public class Kurzschluß {
    static boolean eins() {
        System.out.println("Eins");
        return true; // Ändern in "return false;"
    }
    static boolean zwei() {
        System.out.println("Zwei");
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Main");
        if (eins() && zwei()) {
            System.out.println("Wahr");
        } else {
            System.out.println("Falsch");
        }
    }
}
/*
    Ausgabe (vor Änderung):
    Main
    Eins
    Zwei
    Wahr

    Ausgabe (nach Änderung):
    Main
    Eins
    Falsch
```
