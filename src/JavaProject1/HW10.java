

package JavaProject1;

public class HW10 {
    public static void main(String[] args) {
        String[] names = {"Adama", "Bola", "Adama", "Aziz", "Bola", "Karim"};
        boolean[] isDuplicate = new boolean[names.length]; // Initialize an array to track duplicates

        for (int i = 0; i < names.length - 1; i++) {
            if (!isDuplicate[i]) { // Check if the element is already marked as a duplicate
                for (int j = i + 1; j < names.length; j++) {
                    if (names[i].equals(names[j])) {
                        System.out.println("Duplicate name is: " + names[j]);
                        isDuplicate[j] = true; // Mark the duplicate element
                    }
                }
            }
        }
    }


}


