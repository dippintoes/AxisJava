
public class Circle extends shapes{
	int radius=10;
	@Override
	void calculate_area() {
		System.out.println(3.14*radius*radius);
	}

	@Override
	void calculate_perimeter() {
		System.out.println(2*3.14*radius);
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		
		obj.calculate_area();
		obj.calculate_perimeter();
	}
}

