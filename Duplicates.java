package main.Faizan;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int arr = inp.nextInt();
        int[] array = new int[arr];
        System.out.println("Enter the elements of the array:" + arr);
        for (int i = 0; i < arr; i++){
            array[i] = inp.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Duplicates in the array:");
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.println("Duplicate: " + array[i]);
            }
        }
    }
}
