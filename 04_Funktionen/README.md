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
