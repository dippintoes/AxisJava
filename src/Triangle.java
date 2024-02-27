public class Triangle extends shapes{
	int s3=2;
	int height=5;
	int s1=5, s2=5;
	@Override
	void calculate_area() {
		System.out.println(0.5*s3*height);
	}

	@Override
	void calculate_perimeter() {
		System.out.println(s1+s2+s3);
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		
		obj.calculate_area();
		obj.calculate_perimeter();
	}
}