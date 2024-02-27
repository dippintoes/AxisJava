
public class conditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int num=0;
//			if(num<0) {
//				System.out.println("Negative");
//			}
//			else if(num>0) {
//				System.out.println("Positive");
//			}
//			else {
//				System.out.println("Zero");
//			}
		
		int marks = 23;
		
		if(marks<50) {
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("D");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("C");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("B");
		}
		else if(marks>=80 && marks<=100) {
			System.out.println("A");
		}
		else {
			System.out.println("Invalid data");		}
	}

}
