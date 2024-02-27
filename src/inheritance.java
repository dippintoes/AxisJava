
public class inheritance extends parentClass {

    String s2="This is child class";
	
	public void print() {
		System.out.println("Print from children class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance obj= new inheritance();
		
		System.out.println(obj.s1);
		obj.display();
		System.out.println(obj.s2);
		obj.print();
	}

}
