package array;

public class StringDemo {

	public static void main(String[] args) {
//		String s1="Computer";
//		String s2="Computer";
//		String s3=new String("Computer");
//		System.out.println("Result1: "+(s1==s2));
//		System.out.println("Results2: "+s1.equals(s2));
//		System.out.println("Result3: "+(s1==s3));
//		System.out.println("Result4: "+s1.equals(s3));

		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hmelo";
		String s5="flag";
		System.out.println(s1.compareTo(s3));
		String str5=s1.concat(s2).concat(s3).concat(s4).concat(s5);
		System.out.println(str5);
		System.out.println(s1.isEmpty());
	}

}
