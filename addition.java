package main.Faizan;
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrices: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int col = input.nextInt();

        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] sumMat = new int[row][col];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMat[i][j] = mat1[i][j] + mat2[i][j];
                
            }
        }    
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
