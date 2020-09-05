# Klassen, Methoden und Objekte
## Klassen
```
class [name] {
    Attribute
    Konstruktor
    Methoden
}
```

### Beispiel
Die Klasse Test enthält ein Attribut (String name)
```JAVA
class Test {
    String name;
}

// Erzeugen von drei Objekten

class TestTesten {
    public static void main(String[] args) {
        // Erzeugen eines Objektes und speichern der Referenz
        // in der Variablen test1
        Test test1 = new Test();

        // Zugriff auf das Attribut des test1-Objektes
        test1.name = "Mark Müller";

        Test test2 = new Test();
        test2.name = "Kerstin Meier";

        Test test3 = new Test();

        System.out.println(test1.name);
    }
}
```
* Test = Variablentyp (immer identisch mit der Klasse)
* test? = Variable (frei wählbar)
* new  = Erzeugt neues Objekt
* Test() = Aufruf des sog. Konstruktors (Name ist ebenfalls gleich dem Klassennamen)

## Methoden
Eine Methode ist eine Funktion, die einem Objekt zugeordnet wird.

Beim Erzeugen eines Objektes mit Hilfe von new wird immer eine Methode, der Konstruktor, aufgerufen. Der Konstruktor muss den selben Namen wie die Klasse erhalten.

this. ist ein Platzhalter für das Objekt.
```JAVA
class Test {
    // zahl ist ein Attribut der Klasse Test
    public int zahl;

    // Test() ist der Konstruktor
    public Test() {
        this.zahl = 0;
    }

    // weiterzählen() ist eine Methode (kein static) der Testklasse
    // Methoden können nur auf ein Objekt angewendet werden
    public weiterzählen() {
        this.zahl++;
    }
}
```

## Objekte
```JAVA
class TestTesten {
    //...
    Test test = new Test();
    test.weiterzählen();
    test.weiterzählen();
    test.weiterzählen();

    Test anderesObjekt;
    anderesObjekt = new Test();
    //...
}
```

## Vererbung
```JAVA
class Tier {
    public String name;
    public gibLaut() {
        System.out.println(this.name + " macht ein typisches Geräusch.");
    }
}

// Jeder Hund ist auch ein Tier
class Hund extends Tier {
    // Ersetzen (Überladen) der Methode gibLaut()
    @Override
    public gibLaut() {
        System.out.println(this.name + " bellt.");
    }
}

class TierTesten {
    //...
    Tier tier = new Tier();
    tier.gibLaut();

    Hund hund1 = new Hund();
    hund1.gibLaut();

    Tier hund2 = new Hund();
    hund2.gibLaut();
    //...
}
```

## Sichtbarkeit
Gilt für Klassen, Attribute und Methoden
* public
* private
* protected
* (package)
