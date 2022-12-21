package oops_Concept;

public class Constructor_RoadToll {
	
	String vehicleType;
	int tyre;
	
	
	public void calculateToll() {
	if(tyre==2) {
			System.out.println("Road toll is 0");
	}else if(tyre==4){
		System.out.println("Road toll is 10");
	}else if(tyre==6){
		System.out.println("Road toll is 20");
	}else{
		System.out.println("incorrect tyres number");
	}

}
//	public Constructor_RoadToll() {
//		System.out.println("Default constructor is executed");
//	}
	public Constructor_RoadToll(String vehicleType, int tyre) {
		this.tyre=tyre;//This keyword is referring variable/member of current class not constructor variables okay
		this.vehicleType=vehicleType;
	}
	
}
