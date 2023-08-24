package JavaProject1;

public class HW2 {
    public static void main(String[] args) {
        int[][] num = {
                {10, 20, 30, 40,50},
                { 200, 500, 300, 400,100},
                {10, 22, 58, 48,350}};


        int sum=0;
        for(int row=0; row < num.length; row++){
            for(int col=0; col< num.length; col++){
                sum=sum+num[row][col];
            }
        }
        System.out.println(sum);







    }
}
