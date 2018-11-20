package finalactivity;

import java.util.Scanner;

public class Finalactivity {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        call();
    }

    static void call() {
        System.out.println("Fibonacci or Factorial");
        String method = sc.nextLine();
        which(method);

    }

    static void which(String method) {
        switch (method) {
            case "Fibonacci":
            case "fibonacci":
                fibonacci();
                break;
            case "Factorial":
            case "factorial":
                factorial();
                break;
            default:
                call();
        }


    }

    static void fibonacci() {
        int arr[] = fibofact();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("f(" + arr[i] + ")" + "\t" + fibonacci(arr[i]));

        }

    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    static void factorial() {

        int arr[] = fibofact();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("f(" + arr[i] + ")" + "\t" + fibonacci(arr[i]));
        }
    }

    static int factorial(int n) {
        if (n <= 2) {
            return n;
        } else {
            return (n * factorial(n - 1));
        }
    }

    static int[] fibofact() {
        System.out.println("enter # elements");
        int elements = sc.nextInt();
        int arr[] = new int[elements];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
