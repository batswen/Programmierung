# Schleifen

## WHILE
initialisierung
while (bedingung) {
    ...
    iteration
}

## FOR
for (initialisierung; bedingung; iteration) {
    ...
}

## FOREACH
for (singular: plural) {

}



### Vergleich von WHILE und FOR
```JAVA
// ForSchleife.java
public class ForSchleife {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("!");
        }
    }
}

// WhileSchleife.java
public class WhileSchleife {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("!");
            i++;
        }
    }
}
```

Diese beiden Programme erzeugen den exakt gleichen Code.

```
$ javap -c ForSchleife.class

Compiled from "ForSchleife.java"
public class ForSchleife {
  public ForSchleife();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: bipush        10
       5: if_icmpge     22
       8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #3                  // String !
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: iinc          1, 1
      19: goto          2
      22: return
}
```

```
$ javap -c WhileSchleife.class

Compiled from "WhileSchleife.java"
public class WhileSchleife {
  public WhileSchleife();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: bipush        10
       5: if_icmpge     22
       8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #3                  // String !
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: iinc          1, 1
      19: goto          2
      22: return
}
```
