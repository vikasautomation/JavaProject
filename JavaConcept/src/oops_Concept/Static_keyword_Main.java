package oops_Concept;

import special_Classes.String_Builder;

public class Static_keyword_Main {

	public static void main(String_Builder[] args) {
		// TODO Auto-generated method stub
		Static_Keyword sk1= new Static_Keyword();
		Static_Keyword sk2 = new Static_Keyword();
		
		sk1.age=10;
		sk1.grade="1st";
		Static_Keyword.name="Aman";
		
		
		sk2.age=11;
		sk2.grade="2nd";
		Static_Keyword.name="Tapan";
		
		sk1.displayDetails();
		sk2.displayDetails();
}
}
