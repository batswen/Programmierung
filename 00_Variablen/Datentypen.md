# Datentypen

## Char (Short)
Ein einzelnes Zeichen in einfachen Hochkommas (Apostroph).

## String
Beliebige Anzahl an Zeichen in doppelten Anführungszeichen.
Der String-Datentyp wird durch die String-Klasse erzeugt. Das hat einige Vor- und Nachteile, wie z. B. ist es nicht möglich zwei Zeichenketten durch den ==-Operator zu vergleichen.

## Int / Long / Short / Byte
Integer (immer mit Vorzeichen):
    long (64 Bit, Bereich: -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807)
    int (32 Bit, Bereich: -2,147,483,648 bis 2,147,483,647)
    short (16 Bit, Bereich: -32768 bis 32767)
    byte (8 Bit, Bereich: -128 bis 127)

## Boolean
True oder false

## Float / Double
Fließkommazahlen:
    double (64 Bit)
    float (32 Bit)

### Casting
Kleinere Datentypen können problemlos in größere Datentypen um gewandelt werden, als z. B. short nach int. Short und char können verlustfrei gecastet werden.

```JAVA
int a = 1000000;
short b = 1000;

a = b; // ok, weil int > short

b = a; // Fehler, weil short < int. Verlust von 16 Bits.
b = (short)a;

String s = "Abc";
char c;

b = (short)c; // verlustfrei
c = (char)b; // verlustfrei

c = s.charAt(0); // Wandelt das 0. Zeichen in ein char um
```
