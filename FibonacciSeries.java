
/*Question[2]---Write a Java program to print the Fibonacci series up to a given number using a for loop.
*/
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 2; i < numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
