public class Klammern {
	public static boolean klammernPrüfen(String k) {
		int anzahl = 0;
		for (int i = 0; i < k.length() && anzahl >= 0; i++) {
			if (k.charAt(i) == '(') {
				anzahl++;
			}
			if (k.charAt(i) == ')') {
				anzahl--;
			}
		}
		return anzahl == 0;
	}
	public static void main(String[] args) {
		String k;
		
		k = "()()()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "()()(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = ")(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "()(())()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "())(()";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "(";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = ")";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
		k = "";
		System.out.println("'" + k + "': " + klammernPrüfen(k));
	}
}
/*
Erwartete Ausgabe:
 
'()()()': true
'()()(': false
')(': false
'()(())()': true
'())(()': false
'(': false
')': false
'': true
*/

public class Baum {
	public static void baumZeichnen(int höhe, char krone, char stamm) {
		int i, j;
		for (i = 0; i < höhe; i++) {
			for (j = 0; j < höhe - i - 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < i * 2 + 1; j++) {
				System.out.print(krone);
			}
			System.out.println();
		}
		for (i = 0; i < höhe; i++) {
			for (j = 0; j < höhe - 1; j++) {
				System.out.print(" ");
			}
			System.out.println(stamm);
		}
		
	}
	public static void main(String[] args) {
		baumZeichnen(4, '*', '#');
	}
}

/*
Erwartete Ausgabe:

   *
  ***
 *****
*******
   # 
   # 
   # 
   # 
*/
