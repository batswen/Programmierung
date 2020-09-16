# Klassen, Methoden und Objekte
## Klassen
```
JAVA:
class [name] {
    Attribute
    Konstruktor
    Methoden
}
Python:
class [name]:
```

### Beispiel
Die Klasse Test enthält ein Attribut (String name)
```JAVA
class Test {
    public String name;
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

```PYTHON
class Test:
    pass    # Diese Klasse hat noch keinen Inhalt
# ---

test1 = Test()
test1.name = "Mark Müller"

test2 = Test()
test2.name = "Kerstin Meier"

test3 = Test()

print(test1.name)
```

## Methoden
Eine Methode ist eine Funktion, die einem Objekt zugeordnet wird.

Beim Erzeugen eines Objektes mit Hilfe von new wird immer eine Methode, Konstruktor genannt, aufgerufen. Der Konstruktor muss denselben Namen wie die Klasse erhalten. Ist kein Konstruktor definiert wird vom Compiler ein Standardkonstruktor hinzugefügt.

this. ist ein Platzhalter für das Objekt.
```JAVA
class Test {
    // name ist ein Attribut der Klasse Test
    public String name;

    // Test() ist der Konstruktor
    // Konstruktoren dürfen keinen Rückgabetyp erhalten
    public Test(String name) {
        this.name = name;
    }

    // grüßen() ist eine Methode (kein static) der Testklasse
    // Methoden können nur auf ein Objekt angewendet werden
    public void grüßen() {
        System.out.println("Hallo " + this.name);
    }
}
```

```PYTHON
class Test:
    # Eine Auflistung der Attribute ist nicht nötig/möglich

    # __init__() ist der Konstruktor
    def __init__(self, name): # self (Variable) enthält Referenz auf das Objekt
        self.name = name

    # grüßen() ist eine Methode der Testklasse
    # Methoden können nur auf ein Objekt angewendet werden
    def grüßen(self):
        print("Hallo {}".format(self.name))
```

## Objekte
```JAVA
class TestTesten {
    //...
    Test test = new Test("Hans Wurst");
    test.grüßen();
    test.grüßen();
    test.grüßen();

    Test anderesObjekt;
    anderesObjekt = new Test("Susi Sorglos");
    //...
}
```

```PYTHON
test = Test("Hans Wurst")
test.grüßen()
test.grüßen()
test.grüßen()

anderesObjekt = Test("Susi Sorglos")
```

## Vererbung
```JAVA
class Tier {
    public String name;
    public Tier(String name) {
        this.name = name;
    }
    public void gibLaut() {
        System.out.println(this.name + " macht ein typisches Geräusch.");
    }
}

// Jeder Hund ist auch ein Tier
class Hund extends Tier {
    // Der Konstruktor wird nicht vererbt
    public Hund(String name) {
        this.name = name;
    }
    // Ersetzen (Überladen) der Methode gibLaut()
    @Override
    public void gibLaut() {
        System.out.println(this.name + " bellt.");
    }
}

class TierTesten {
    //...
    Tier tier = new Tier("Eidechse Lukas");
    tier.gibLaut();

    Hund hund1 = new Hund("Bello");
    hund1.gibLaut();

    Tier hund2 = new Hund("Hasso");
    hund2.gibLaut();
    //...
}
```

```PYTHON
class Tier:
    def __init__(self, name):
        self.name = name

    def gibLaut(self):
        print("{} macht ein typisches Geräusch.".format(self.name))

# Jeder Hund ist auch ein Tier
class Hund(Tier):
    # Der Konstruktor wird nicht vererbt
    def __init__(self, name):
        self.name = name

    # Ersetzen (Überladen) der Methode gibLaut()
    def gibLaut(self):
        print("{} bellt.".format(self.name))

tier = Tier("Eidechse Lukas")
tier.gibLaut()

hund1 = Hund("Bello")
hund1.gibLaut()

hund2 = Hund("Hasso")
hund2.gibLaut()
```

## Sichtbarkeit (Java)
Gilt für Klassen, Attribute und Methoden
* public        Ausserhalb der Klasse sichtbar
* private       Nur innerhalb der Klasse sichtbar
* protected     Wie private, wird jedoch vererbt
* (package)     Innerhalb eines Packages sichtbar
