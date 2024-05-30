import java.util.Scanner;

public class NumberofTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate the number triangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
