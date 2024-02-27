
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int i;
		int fact=1;
		
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of givern number is: "+ fact);

	}

}
