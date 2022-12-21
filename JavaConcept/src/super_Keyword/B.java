package super_Keyword;

public class B extends Class_A{
	int num1=200;
	public void doThis() {
		System.out.println("DO this from B");
	}
	public void xyz() {
		super.doThis();
		System.out.println(super.num1);
		System.out.println("xyz executed");
	
	}
}
