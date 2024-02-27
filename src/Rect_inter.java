
public class Rect_inter implements shapeinterface{
	int l=10;
	int b=10;
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(l*b);
	}
	
	public static void main(String[] agrs) {
		Rect_inter obj=new Rect_inter();
		
		obj.getArea();
	}
}
