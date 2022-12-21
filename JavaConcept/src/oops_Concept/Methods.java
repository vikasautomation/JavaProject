package oops_Concept;

import special_Classes.String_Builder;

public class Methods {

	public static void main(String_Builder[] args) {
		Methods m=new Methods();
		m.Addition(100, 200);
		m.DoThis();
		int x=m.Multiply(12, 5);
		System.out.println(x);
	}
	
	public void DoThis(){
	System.out.println("Do this executed");	
	}
	
	public void Addition(int x, int y) {
	System.out.println(x+y);
	}
	public int Multiply(int a, int b) {
		int c= a*b;
		return c;
		
	}

}
