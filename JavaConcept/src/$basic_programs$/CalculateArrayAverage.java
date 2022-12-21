package $basic_programs$;

public class CalculateArrayAverage {

	public static void main(String[] args) {
		// Average= sum/total numbers
		double arraynew[]= {20,30,40,50,60,70};
		double sum=0;
		double average=0;
		
		
		for(int i=0;i<arraynew.length;i++) {
			sum = sum + arraynew[i];
		}
		average= sum/arraynew.length;
		System.out.println("The average is : "+average);
		
		
		for(int j=0;j<arraynew.length;j++) {
			
			if(average > arraynew[j]){
				double smallnumber=arraynew[j];
				System.out.println("Here we have number less to average "+smallnumber);
			}
			else 	if(average < arraynew[j]){
				double largeNumber=arraynew[j];
				System.out.println("Here we have number greater to average "+largeNumber);
			
			}
			else if(average == arraynew[j]){
				double equalNumber=arraynew[j];
				System.out.println("Here we have number equal to average "+equalNumber);
			}
			else {
				System.out.println(" We don't have equal number ");
			}
				
			
		}
		
	}

}
