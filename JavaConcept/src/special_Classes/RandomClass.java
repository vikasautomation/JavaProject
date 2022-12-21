package special_Classes;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1= new Random();
		for(int i=0; i<=100;i++) {
		//	System.out.println(r1.nextInt(1000));//Generate random number in between 0 to 1000
		//  System.out.println(r1.nextInt(5000)+1000);//Generate random number in between 1000 to 6000
		System.out.println((int)(Math.random()* 4000)+1000);//Generate random number in between 1000 to 5000
		}
		
		
	}

}
