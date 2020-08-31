# Datentypen

## Char
Ein einzelnes Zeichen in einfachen Hochkommas (Apostroph).
```
'a'
'1'
' '
```

## String (Zeichenkette)
Beliebige Anzahl an Zeichen in doppelten Anführungszeichen.
Der String-Datentyp wird durch die String-Klasse erzeugt. Das hat einige Vor- und Nachteile, wie z. B. ist es nicht möglich zwei Zeichenketten durch den ==-Operator zu vergleichen.
```
"Zeichenkette in Anführungszeichen"
"Noch ein String"
```

## Int / Long / Short / Byte
Integer (immer mit Vorzeichen; Integerzahlen sind immer dann negativ, wenn das höchste Bit Eins ist). An Long-Zahlen im Quelltext, die größer als 32 Bit sind, muss ein 'l' angehängt werden.
```
long  (64 Bit, Bereich: -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807)
int   (32 Bit, Bereich: -2,147,483,648 bis 2,147,483,647)
short (16 Bit, Bereich: -32768 bis 32767)
byte  ( 8 Bit, Bereich: -128 bis 127)
```
Die Interger-Klasse bietet Funktionen zur Verarbeitung von Vorzeichenlosen Zahlen an.

## Boolean
Wahr oder Falsch

## Float / Double
Fließkommazahlen im Quelltext werden immer als double betrachtet. Will man ein float schrieben, so muss an die letzte Ziffer ein 'f' angehägt werden (siehe unten).
```
double (64 Bit, Fünfzehn Nachkommastellen)
float (32 Bit, Sechs Nachkommastellen)
```

### Casting
Kleinere Datentypen können problemlos in größere Datentypen um gewandelt werden, als z. B. short nach int. Short und char können verlustfrei gecastet werden.

```JAVA
int artikelnummer = 12_333_61230_8;     // = 12333612308
int vieleUnterstriche = 1__________0;   // = 10
int hex = 0xF0A08020; // Hexzahl
int bin = 0b01010101_10101010; // Binär
int a = 1000000;
short b = 1000;
byte by = 100;
long l = 5_000_000_000L;   // "L" oder "l" anhängen!
float f = 3.14F;        // "F" oder "f" anhängen!
double d = 3.14159;

// int = short
a = b;          // ok, weil int > short

// short = int
a = 1000000;
b = a;          // Fehler, weil short < int. Verlust von 16 Bits.

// short = (short)int
b = (short)a;   // Kein Fehler mehr, aber b enthält 16960.

// byte = (byte)int
by = (byte)a;   // by enthält 64.

// byte = (byte)signed byte
by = (byte)200; // Kein Fehler, by enthält -56.
/*
1.000.000 = 00000000 00001111 01000010 01000000 (32 Bit = int)
   16.960 =                   01000010 01000000 (16 Bit = short)
-56 o.200 =                            11001000 ( 8 Bit = byte)
       64 =                            01000000 ( 8 Bit = byte)
*/

String s = "Abc";
char c;

b = (short)c; // verlustfrei
c = (char)b; // verlustfrei

c = s.charAt(0); // Wandelt das 0. Zeichen in ein char um

System.out.println(1.11111111111111111f);   // Ausgabe: 1.1111112
System.out.println(1.11111111111111111);    // Ausgabe: 1.1111111111111112
```
