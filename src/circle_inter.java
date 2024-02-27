public class circle_inter implements shapeinterface{
	int r=10;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(3.14*r*r);
	}
	
	public static void main(String[] agrs) {
		circle_inter obj=new circle_inter();
		
		obj.getArea();
	}
}
