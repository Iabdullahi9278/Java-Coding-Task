
package JavaProject1;

public class HW8 {
    public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60};

            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println("The maximum value is " + max);
            System.out.println("The minimum value is " + min);

    }

}
