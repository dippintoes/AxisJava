package assignment;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter a string: ");
	     String inputString = scanner.nextLine();
	     StringBuilder reversedString = new StringBuilder();
	     StringBuilder currentWord = new StringBuilder();
	     for (char ch : inputString.toCharArray()) {
	         if (ch == ' ') {
	            reversedString.append(currentWord.reverse()).append(' ');
	            currentWord.setLength(0);
	         } else {
	            currentWord.append(ch);
	         }
	      }
	      reversedString.append(currentWord.reverse());
	      System.out.println("Result after reversing each word: " + reversedString);
	      scanner.close();
	}
}
