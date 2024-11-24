import java.util.Scanner;

// Class to perform matrix operations
class MatrixOperations {
    private int[][] mat1; // First matrix
    private int[][] mat2; // Second matrix
    private int[][] result; // Result matrix for operations
    private int rows, cols; // Matrix dimensions

    Scanner sc = new Scanner(System.in);

    // Method to get size and input for matrices
    void getInput() {
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        cols = sc.nextInt();

        // Initialize matrices based on user input
        mat1 = new int[rows][cols];
        mat2 = new int[rows][cols];
        result = new int[rows][cols];

        // Input for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display a matrix
    void displayMatrix(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    void addMatrices() {
        System.out.println("Addition of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        displayMatrix(result);
    }

    // Method to subtract two matrices
    void subtractMatrices() {
        System.out.println("Subtraction of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        displayMatrix(result);
    }

    // Method to multiply two matrices
    void multiplyMatrices() {
        if (rows != cols) {
            System.out.println("Matrix multiplication is only possible for square matrices.");
            return;
        }

        System.out.println("Multiplication of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0; // Reset result cell
                for (int k = 0; k < cols; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        displayMatrix(result);
    }
}

// Main class to execute the program
public class Matrix {
    public static void main(String[] args) {
        MatrixOperations matrixOps = new MatrixOperations(); // Create an object
        matrixOps.getInput(); // Get matrices from the user

        // Perform operations
        matrixOps.addMatrices();
        matrixOps.subtractMatrices();
        matrixOps.multiplyMatrices();
    }
}
