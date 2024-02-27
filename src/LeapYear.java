
public class LeapYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2024;
		
		if(year%100==0 && year%400==0) {
			System.out.println(year+" year is a Leap Year.");
		}
		else if(year%100!=0 && year%4==0) {
			System.out.println(year+" year is a Leap Year.");
		}
		else {
			System.out.println(year+" year is not a Leap Year.");
		}
	}
}
