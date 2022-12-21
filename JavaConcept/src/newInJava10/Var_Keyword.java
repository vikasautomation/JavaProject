package newInJava10;

import java.util.Scanner;

public class Var_Keyword {
		int num4;
		//var num5;//not allowed
	
	public static void main(String[] args) {
		/*Var keyword :- As per the value type it decide reference variable type or data type.
		Var Not allowed: 
		Var not allowed for class level variable
		Var not for refering array varible when initialize value also
		var can't use as math arguments variable
		Var allowed: As method level variable
		-To create object 
		-To declare array */
		int num1= 10;
		var num2= 20;
		int[] arr1= new int[10];
		var arr2= new int[10];
		int [] arr3= {10,20,30};
		//var arr4= {10,20,30}; not allows
		
		Scanner s1= new Scanner(System.in);
		var s2= new Scanner(System.in);
		int x =Var_Keyword.add(100, 200);
		var y=Var_Keyword.add(100, 200);
		System.out.println(x);
		System.out.println(y);
		
		
	}
	public static int add(int a , int b) {
		return a+b;
	}

}
