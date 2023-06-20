package program_Practice;

public class RotateLeftArrayElement {

	public static void main(String[] args) {
			
		   int [] arr = new int [] {1, 2, 3, 4, 5};  
	
		   System.out.println("Display original Array: ");
		   for(int i=0; i<arr.length; i++) {
			   System.out.println(arr[i]+ " ");
			   
		   }
		   
		   //Rotate element 
		   int first;
		   first= arr[0];
	
		   for(int j=0; j<arr.length-1;j++) {
			   arr[j]=arr[j+1];
			   arr[j]= first;
		   }
		   
		   
	
		   System.out.println();
		   
	
	//print array after rotation
	 for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]+ "");
	}
	
	
	}
}


	

