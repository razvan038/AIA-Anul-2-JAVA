import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti dimensiunea matricei patratice: ");
        int n = scanner.nextInt();
        
        int[][] matrix = new int[n][n];
        System.out.println("Introduceti elementele matricei:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int sumAboveSecondaryDiagonal = 0;
        int sumBelowSecondaryDiagonal = 0;
        int sumAboveMainDiagonal = 0;
        int sumBelowMainDiagonal = 0;

        System.out.println("Matricea introdusa este:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Elementele diagonalei secundare sunt:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    sumAboveSecondaryDiagonal += matrix[i][j];
                } else if (j > n - 1 - i) {
                    sumBelowSecondaryDiagonal += matrix[i][j];
                }
                if (j > i) {
                    sumAboveMainDiagonal += matrix[i][j];
                } else if (j < i) {
                    sumBelowMainDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println();
        
        System.out.println("Suma elementelor deasupra diagonalei secundare: " + sumAboveSecondaryDiagonal);
        System.out.println("Suma elementelor sub diagonala secundara: " + sumBelowSecondaryDiagonal);
        System.out.println("Suma elementelor deasupra diagonalei principale: " + sumAboveMainDiagonal);
        System.out.println("Suma elementelor sub diagonala principala: " + sumBelowMainDiagonal);
    }
}