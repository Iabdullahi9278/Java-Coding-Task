
package JavaProject1;

public class HW4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 18;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the numbers without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
