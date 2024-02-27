
public class stringsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello World";
		String s2="Delhi";
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s2.replace('D','F'));
		System.out.println(s1.substring(3));
		String[] temp=s1.split(" ");
		for(String s:temp) {
			System.out.println(s);
		}
		
		
	}

}
