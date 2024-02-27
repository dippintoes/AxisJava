package assignment;

import java.util.Scanner;

public class RemovePresentInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the input string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter characters to remove: ");
        String charactersToRemove = scanner.nextLine();
        
        String result = inputString.replace(charactersToRemove, "");

        System.out.println("Result after removing characters: " + result);
    }
}
