public class EvenSum {
    public static void main(String[] args) {
        int i = 2, sum = 0; // Start from 2 since it's the first even number

        while (i <= 50) {
            sum += i; // Add even number to sum
            i += 2; // Move to next even number
        }

        System.out.println("Sum of even numbers from 1 to 50: " + sum);
    }
}