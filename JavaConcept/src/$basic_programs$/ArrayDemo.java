package $basic_programs$;

public class ArrayDemo {

	
	
	public static void main(String[] args) {
		int[] arr = {10, 22, 100, 101, 102 ,103, 10 ,3, 99};
		int x=0, y=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				y=x;
				x=arr[i];
			}
			
			
		}
		System.out.println(y);
		
	}

}
