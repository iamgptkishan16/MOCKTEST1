
/*Question[3]----Write a Java program to calculate the average of a list of numbers using a do-while loop.
*/
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int sum = 0;
        int number;
        int i = 0;

        do {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);

        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}
