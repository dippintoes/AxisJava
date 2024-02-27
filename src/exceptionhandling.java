
public class exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/0;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is executed");
		}
	}

}
