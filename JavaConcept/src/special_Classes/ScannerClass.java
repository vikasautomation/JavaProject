package special_Classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="";
		Scanner s1= new Scanner(System.in);
		System.out.println("please enter a string");
		String str= s1.nextLine();
		
		for(int i=0; i<=str.length()-1; i++) {
			temp= str.charAt(i) + temp;
		}
		System.out.println("Reverse string is "+ temp);

	}

}
