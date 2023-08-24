

package JavaProject1;

public class HW9 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};

        int largest = num[0];
        int secondLargest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }

        System.out.println("The second largest number is " + secondLargest);
    }

}
