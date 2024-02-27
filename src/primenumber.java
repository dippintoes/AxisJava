
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3;
		boolean isPrime=true;
		int i;
		
		if(num<=1)
		{
			isPrime=false;
		}
		else {
			for(i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
				}
			}
		}
		if(isPrime==false) {
			System.out.println("Number is not a prime number.");
		}
		else {
			System.out.println("Number is a prime number.");
		}
	}
}
