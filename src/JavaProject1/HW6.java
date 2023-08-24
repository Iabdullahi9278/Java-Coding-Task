
package JavaProject1;

public class HW6 {
    public static void main(String[] args) {
        int number = 19;
        boolean isPrime = true;

            if (number <= 1) {
                isPrime = false; // Numbers less than or equal to 1 are not prime
            } else {
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        isPrime = false; // If it's divisible by any number between 2 and sqrt(number), it's not prime
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number!");
            } else {
                System.out.println(number + " is not a prime number!");
            }


    }

}
