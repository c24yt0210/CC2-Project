package fiboarray;

public class Fiboarray {

    public static void main(String[] args) {
        int x[] = {3, 5, 7, 13, 2, 3, 9};
        display(x);
    }

    static void display(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("f(" + x[i] + ")");
            System.out.print("\t ");


        }
        System.out.println(" ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(fibo(x[i]));
            System.out.print("\t ");


        }

    }

    static int fibo(int nth) {
        if (nth == 0) {
            return 0;
        }
        if (nth == 1) {
            return 1;
        } else {
            return fibo(nth - 1) + fibo(nth - 2);
        }

    }
}
