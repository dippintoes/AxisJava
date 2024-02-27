package assignment;

import java.util.Scanner;

public class Stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string to be concetenated");
		String s1=sc.nextLine();
		System.out.println("Enter the second string to be concatenated");
		String s2=sc.nextLine();
		System.out.println("Concatenated string is: "+s1+s2);
		sc.close();
	}

}
