# Klassen, Methoden und Objekte
## Klassen
```
class [name] {
    ...
}
```

## Methoden
```JAVA
class Test {
    public int zahl;
    public Test() {
        this.zahl = 0;
    }
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
