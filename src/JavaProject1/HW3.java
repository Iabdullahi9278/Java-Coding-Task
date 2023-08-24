package JavaProject1;

public class HW3 {
    public static void main(String[] args) {
        int[][] numbers = {
                {11, 20, 83, 44},
                {25, 65, 75, 80},
                {95, 110, 111, 112}
        };

        System.out.println("Even Numbers:");

        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
