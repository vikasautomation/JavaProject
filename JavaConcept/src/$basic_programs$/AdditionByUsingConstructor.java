package $basic_programs$;

public class AdditionByUsingConstructor {

	int a;
	int b;
	int c;
	AdditionByUsingConstructor(int a, int b){
		this.a=a;
		this.b=b;
	
	}
	AdditionByUsingConstructor(int a, int b, int c){
	this.a=a;
	this.b=b;
	this.c=c;
	
}	
	
	
	void sum(){
		try {
			
			int i = 10/0;
		}catch(Exception e) {
			System.out.print("exception");
		}finally {
			System.out.print("finally");
		}
		
	}
	public static void main(String[] args) {
		AdditionByUsingConstructor abc = new AdditionByUsingConstructor(2,4);
		AdditionByUsingConstructor abc1 = new AdditionByUsingConstructor(2,4,4);
		abc.sum();
		abc1.sum();

	}

}
