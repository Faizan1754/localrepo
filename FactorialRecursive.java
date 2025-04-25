package main.Faizan;
import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = inp.nextInt();

        long factorial = factorial(n);

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
