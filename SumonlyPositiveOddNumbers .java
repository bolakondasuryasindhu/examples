import java.util.Scanner;

public class SumonlyPositiveOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of n elements
        int[] array = new int[n];

        // Prompt the user to enter the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of positive odd numbers
        int sum = sumPositiveOddNumbers(array);

        // Print the result
        System.out.println("Sum of positive odd numbers: " + sum);
    }

    // Method to sum positive odd numbers
    public static int sumPositiveOddNumbers(int[] array) {
        int sum = 0;

        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                sum += num;
            }
        }

        return sum;
    }
}
