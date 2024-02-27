
public class StaticNonStatic {

	// non static data 
		String s1 = "hello world";
		// static data
		static int empid = 78899;
		public static void main(String[] args) {
			StaticNonStatic obj = new StaticNonStatic();	
			System.out.println(obj.s1);
			System.out.println(empid);
		}
}
