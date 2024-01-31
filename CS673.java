public class CS673 {
    public static void main(String[] args) {
        int max = 12;

        for (int i = 1; i <= max; i++) {
            System.out.println("Multiplication Table of " + i);

            for (int j = 1; j <= max; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}
