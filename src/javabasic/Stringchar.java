package javabasic;

public class Stringchar {

	public static void main(String[] args) {
		// finding index of char from string
		String Name = "Rajat Prajapati";
		char s =Name.charAt(7);
		System.out.println(s);
		char[]mn =Name.toCharArray();
		System.out.println(mn[1]);
		int index =Name.indexOf("Prajapati");
		System.out.println(index);

	}

}
