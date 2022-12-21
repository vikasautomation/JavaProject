package special_Classes;

public class StringBuilder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1= new StringBuilder("Learing is fun");
		sb1.insert(8, "JAVA ");
		System.out.println(sb1);
		sb1.replace(8, 12, "Everything");
		System.out.println(sb1);
		sb1.delete(8, 18);
		System.out.println(sb1);
		String str1 = "DJFKJDSKFNSKJNKJSNFKSNJJDSDGDGDFG";
		System.out.println(str1.replace("JJ", "vikas"));
		sb1.reverse();
		System.out.println(sb1);
		

	}

}
