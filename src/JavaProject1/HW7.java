
package JavaProject1;

public class HW7 {
        public static void main(String[] args) {
            int n = 10; // number of Fibonacci numbers to print
            int a = 0, b = 1; // first two Fibonacci numbers

            System.out.println("The first 10 Fibonacci numbers are:");
            for (int i = 0; i < n; i++) {
                System.out.println(a);
                int c = a + b;
                a = b;
                b = c;
            }
        }

}
