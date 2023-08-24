
package JavaProject1;

public class HW5 {
    public static void main(String[] args) {
        int[][] values = {{105, 106, 110, 98, 75, 96, 101},
                          {105, 108, 150, 98, 85, 98, 107}};
        int sumE = 0;
        int sumO = 0;

        for (int[] row : values) {
            for (int number : row) {
                if (number % 2 == 0) {
                    sumE += number;
                } else {
                    sumO += number;
                }
            }
        }

        System.out.println("Sum of Even Numbers: " + sumE);
        System.out.println("Sum of Odd Numbers: " + sumO);
    }

}
