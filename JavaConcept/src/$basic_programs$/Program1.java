package $basic_programs$;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  count=1;
		while(count<=15) {
			System.out.println(count % 2 == 1 ? "*****" : "+++++");
			++count ;
		}

	}

}
