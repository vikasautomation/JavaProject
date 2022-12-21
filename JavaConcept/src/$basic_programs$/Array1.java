package $basic_programs$;

public class Array1 {
	    public static void main(String a[]){
	        
	        //After implementing, copy the below code in JShell to execute
	        int scores[]={281, 344, 265, 272, 236, 324, 287};
	        double sum=0,avg=0;
	        
	        for(int index=0;index<scores.length;index++){
	            sum=sum+scores[index];
	        }
	       
	        avg=sum/scores.length;
	        
	        System.out.println("The average score of te team is "+avg);
	        //Complete the code as desired output shown in problem statement
	    }
	}

