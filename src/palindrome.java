import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be checked: ");
		
		String s1=sc.nextLine();
		String reverse="";
		
		int length = s1.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		
		if(s1.equals(reverse)) {
			System.out.println("Entered string is a palindrome.");
		}
		else {
			System.out.println("Entered string is not a palindrome.");
		}
	
		
	}

}
