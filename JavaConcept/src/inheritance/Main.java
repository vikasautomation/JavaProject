package inheritance;

public class Main {

	public static void main(String[] args) {
		//Inheritance :- Whenever child class using members of parent class by using extends keyword 
		//
		Class2 c2 =new Class2();
		c2.num1=200;
		c2.num2=100;
		c2.doAddition();
		c2.doSubstraction();
		
		Class1 c1 = new Class1();
		c1.num1=20;
		c1.num2=10;
		c1.doAddition();

	}

}
