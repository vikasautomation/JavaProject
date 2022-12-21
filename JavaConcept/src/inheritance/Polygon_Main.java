package inheritance;

public class Polygon_Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle() ;
		tr.setBaseAndHeight(4.6,5.7);
		tr.calcArea();
		
		Rectangle rr= new Rectangle();
		rr.setBaseAndHeight(7, 9);
		rr.calcArea();

	}

}
