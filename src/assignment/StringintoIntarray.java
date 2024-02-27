package assignment;

import java.util.Scanner;

public class StringintoIntarray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of space-separated integers: ");
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split("\\s+");
        int[] integerArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            try {
                integerArray[i] = Integer.parseInt(stringArray[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Unable to convert string to integer at position " + (i + 1));
                return; 
            }
        }
        System.out.print("Integer Array: [");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i]);
            if (i < integerArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}
