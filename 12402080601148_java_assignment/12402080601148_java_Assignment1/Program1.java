//Problem statement
//Write a Java program to perform array and string operations such as reverse, sort, search, average, and 
//finding the maximum element using classes and objects.
import java.util.Scanner;

class ArrayOperations {

    int[] arr; 
    int n; 

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        arr = new int[n]; // Create array

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void reverse() {
        System.out.print("Reversed Array: ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    void sort() {

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    void average() {

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Average = " + avg);
    }
    void maximum() {

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
    }
    void search(int key) {

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                return;
            }
        }

        System.out.println("Element not found");
    }
}
public class Program1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayOperations obj = new ArrayOperations();
        obj.input();
        obj.reverse();
        obj.sort();
        obj.average();
        obj.maximum();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        obj.search(key);
        sc.close(); 
    }
}