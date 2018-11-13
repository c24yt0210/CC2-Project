package recursion;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        display();
    }

    public static int userInput() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        return n;
    }
// 
    static void display() {
        int n = userInput();
        for (int i = 0; i <= n; i++) {
            System.out.print("f(" + i + ")\t");
        }
        System.out.println("");

        for (int x = 0; x <= n; x++) {
        for (int a = 0; a <= x; a++) {       
        System.out.print(fibo(a) + "\t");
            }
        System.out.println("");
        }

    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }
}
