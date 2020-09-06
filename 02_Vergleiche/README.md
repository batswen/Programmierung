# Vergleiche
In den meisten Programmiersprachen gibt es den Datentyp Wahrheitswert: "Boolean" (JAVA) bzw "Bool" (C++). Dieser kann nur die Werte "True" oder "False" annehmen.

## Bool'sche Ausdrücke
Einen Wahrheitswert erhält man durch Vergleiche. Es gibt die folgenden sechs verschiedenen Möglichkeiten Werte zu vergleichen:
<ul>
<li>== Gleich</li>
<li>!= Ungleich</li>
<li>&gt; Größer als</li>
<li>< Kleiner als</li>
<li>&gt;= Größer oder Gleich</li>
<li><= Kleiner oder Gleich</li>
</ul>
Jeder dieser Vergleiche ergibt entweder Wahr (true) oder Falsch (false).

### Beispiele
<ul>
<li>1 < 3 (true)</li>
<li>'a' < 'z' (true)</li>
<li>3 == 5 (false)</li>
<li>3 != 5 (true)</li>
<li>3 > 5 (false)</li>
<li>8 > 5 (true)</li>
</ul>
Achtung: Bei Java ist es nicht möglich Zeichenketten zu vergleichen.
Hierfür muss die equals()-Methode verwendet werden.

```JAVA
    "abc".equals("abc") (true)
    "abc".equals("123") (false)
```

## Verknüpfungen mit UND und ODER (Kurzschluss-Operatoren)
Die Operatoren && (Python: and) und || (Python: or) werden benutzt um mehrere Vergleiche durchzuführen. Dabei handelt es sich um sog. Kurzschluss-Operatoren, die evtl. nicht alle Operationen ausführen. Der Fall false && true führt nur den ersten Vergleich aus, danach steht bereits fest, dass das Ergebnis false sein muss. Der zweite Vergleich (z. B. ein Funktionsaufruf) wird übersprungen.

Java
<ul>
<li>true && true (true)</li>
<li>true && false (false)</li>
<li>false && true* (false)</li>
<li>false && false* (false)</li>
</ul>

Python
<ul>
<li>True and True (True)</li>
<li>True and False (False)</li>
<li>False and True* (False)</li>
<li>False and False* (False)</li>
</ul>
<ul>

Java
<ul>
<li>true || true* (true)</li>
<li>true || false* (true)</li>
<li>false || true (true)</li>
<li>false || false (false)</li>
</ul>

Python
<ul>
<li>True or True (True)</li>
<li>True or False (False)</li>
<li>False or True* (False)</li>
<li>False or False* (False)</li>
</ul>
Bei den mit einem Asterisk markierten Verknüpfungen wird die zweite Prüfung
nicht ausgeführt!

### Beispiel
```JAVA
if (0 < 1 && 1 < 2) { ... } // beide Prüfungen werden ausgeführt
if (0 > 1 && 1 > 2) { ... } // 1 > 2 wird nicht ausgeführt
```

```PYTHON
if 0 < 1 and 1 < 1: # beide Prüfungen werden ausgeführt
if 0 > 1 and 1 > 2: # 1 > 2 wird nicht ausgeführt
```

## Nicht
Der Nicht-Operator kehrt den Wahrheitswert um, d. h. !true => false und !false => true.

### Beispiel
```JAVA
if (!false) { ... } // Die Anweisungen werden ausgeführt
if (!true) { ... }  // Nur ein ELSE-Zweig wird ausgeführt
```

```PYTHON
if not False: # Die Anweisungen werden ausgeführt
if not True:  # Nur ein ELSE-Zweig wird ausgeführt
```
