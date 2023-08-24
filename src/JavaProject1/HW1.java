package JavaProject1;

public class HW1 {
    public static void main(String[] args) {
        int[] temperatures ={91,80,100,89,90,93,75,64};

        int highestTemperature = temperatures[0];
        int lowestTemperature = temperatures[0];

        for (int temperature : temperatures) {
                if (temperature > highestTemperature) {
                    highestTemperature = temperature;
                }else if (temperature < lowestTemperature) {
                    lowestTemperature = temperature;
                }
        }

        System.out.println("The highest temperature is " + highestTemperature);
        System.out.println("The lowest temperature is " + lowestTemperature);





    }
}
