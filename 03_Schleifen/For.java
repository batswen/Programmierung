public class For {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("In der While-Schleife, i: " + i);
            i++;
        }


        int j = 0;
        for (; j < 10;) {
            System.out.println("In der For-Schleife, j: " + j);
            j++;
        }
        System.out.println("Nach der For-Schleife, j: " + j);


        for (int k = 0; k < 10; k++) {
            System.out.println("In der For-Schleife, k: " + k);
        }
        System.out.println("Nach der For-Schleife, k: " + k);

        /*
        for(;;) {
            System.out.println("Endlosschleife")
        }
        */
    }
}
