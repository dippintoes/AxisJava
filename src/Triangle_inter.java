public class Triangle_inter implements shapeinterface{
	int b=10,h=10;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(0.5*b*h);
	}
	
	public static void main(String[] agrs) {
		Triangle_inter obj=new Triangle_inter();
		
		obj.getArea();
	}
}
