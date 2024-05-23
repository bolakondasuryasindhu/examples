import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrix
        int rows = 3;
        int cols = 4;
        
        // Create the matrix
        int[][] matrix = new int[rows][cols];
        
        // Prompt the user to enter the elements
        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Compute the transpose
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print the transpose
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
