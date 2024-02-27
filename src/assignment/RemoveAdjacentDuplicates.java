package assignment;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with adjacent duplicates: ");
        String inputString = scanner.nextLine();
        String result = "";
        char prevChar = '\0';  
        for (char currentChar : inputString.toCharArray()) {
            if (currentChar != prevChar) {
                result += currentChar;
            }
            prevChar = currentChar;
        }
        System.out.println("Result after removing adjacent duplicates: " + result.toString());
        scanner.close();
    }
}
