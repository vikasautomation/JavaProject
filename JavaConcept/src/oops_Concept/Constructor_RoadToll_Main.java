package oops_Concept;

public class Constructor_RoadToll_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructor_RoadToll rt= new Constructor_RoadToll();
//		rt.tyre=6;
//		rt.vehicleType="Truck";
//		rt.calculateToll();
		
		
		
		//java assume default constructor only when there is no constructor present 
		//if user create explicit constructor then user must create object accordingly to constructor or java 
		//forced to use that constructor.
		Constructor_RoadToll rt2= new Constructor_RoadToll("Truck" , 6);
		rt2.calculateToll();
	}
	

}
