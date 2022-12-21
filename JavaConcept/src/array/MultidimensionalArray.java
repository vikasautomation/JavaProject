package array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int a[][]= new int[2][3];
		a[0][0]= 2;
		a[0][1]= 3;
		a[0][2]= 4;
		a[1][0]= 5;
		a[1][1]= 6;
		a[1][2]= 7;
		
		
		int b[][]= {{3,4,}, {5,6} ,{7,8}} ;
		
//		for(int i=0;i<=1; i++) {
//			for(int j=0; j<=2; j++) {
//		System.out.print(a[i][j]);		
//				
//			}
			
//
//		}
		for(int i=0;i<=2; i++) {
			for(int j=0; j<=1; j++) {
		System.out.print(b[i][j]);		
				
			}
			
		}
		

	}

}
