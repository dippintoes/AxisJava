import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class exceptionhandling1 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			
			List<Integer> number = new ArrayList<>();
			
			System.out.println("How many numbers do you want to input?");
			
			int count=sc.nextInt();
			
			System.out.println("Enter the list of numbers:");
			
			for(int i=0;i<count;i++) {
				int num=sc.nextInt();
				number.add(num);
			}
			checkDuplicates(number);
			System.out.println("No duplicates!");
		}
		catch(Duplicate_Number_Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
	public static void checkDuplicates(List<Integer> number) throws Duplicate_Number_Exception {
		Set<Integer> uniqueNum = new HashSet<>();
		
		for(int num: number) {
			if(uniqueNum.contains(num)) {
				throw new Duplicate_Number_Exception("There are duplicate numbers");
			}
			uniqueNum.add(num);
		}
	}
}

class Duplicate_Number_Exception extends Exception {
	public Duplicate_Number_Exception(String message) {
		super(message);
	}
}
