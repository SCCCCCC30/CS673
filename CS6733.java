import java.math.BigInteger;

public class CS6733 {
    public static void main(String[] args) {
        final int count = 100;
        BigInteger[] fibonacciNumbers = new BigInteger[count];


        fibonacciNumbers[0] = BigInteger.ONE;
        fibonacciNumbers[1] = BigInteger.ONE;


        for (int i = 2; i < count; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1].add(fibonacciNumbers[i - 2]);
        }


        for (int i = 0; i < count; i++) {
            System.out.println("Fibonacci number " + (i + 1) + ": " + fibonacciNumbers[i]);
        }
    }
}
