

import java.util.Scanner;

public class SumPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("The sum of the positive numbers entered is: " + sum);
        scanner.close();
    }
}