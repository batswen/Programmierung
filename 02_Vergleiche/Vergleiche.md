# Vergleiche
In den meisten Programmiersprachen gibt es den Datentyp "Boolean" bzw "Bool".
Dieser kann nur die Werte "True" oder "False" annehmen.

## Bool'sche Ausdrücke
Es gibt sechs verschiedene Möglichkeiten Werte zu vergleichen:
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

### Verknüpfungen mit UND und ODER (Kurzschluss-Operatoren)
Die Operatoren && (und) und || (oder) werden benutzt um mehrere Vergleiche durchzuführen. Dabei handelt es sich um sog. Kurzschluss-Operatoren, die evtl. nicht alle Operationen ausführen. Der Fall false && true führt nur den ersten Vergleich aus, danach steht bereits fest, dass das Ergebnis false sein muss. Der zweite Vergleich (z. B. ein Funktionsaufruf) wird übersprungen.
<ul>
<li>true && true (true)</li>
<li>true && false (false)</li>
<li>false && true* (false)</li>
<li>false && false* (false)</li>
</ul>
<ul>
<li>true || true* (true)</li>
<li>true || false* (true)</li>
<li>false || true (true)</li>
<li>false || false (false)</li>
</ul>
Bei den mit einem Asterisk markierten Verknüpfungen wird die zweite Prüfung
nicht ausgeführt!

### Beispiel
```JAVA
    if (0 < 1 && 1 < 2) { ... } // beide Prüfungen werden ausgeführt
    if (0 > 1 && 1 > 2) { ... } // 1 > 2 wird nicht ausgeführt
```
