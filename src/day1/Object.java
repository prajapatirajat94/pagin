package day1;

public class Object {

	String name;// global variable or class variable
	public static int age =30;
	String gender;
	
	public static void main(String[] args) {
	   Object on = new Object();
	   on.emp("rajat", 20);
	   on.emp("raj", 25);
	   on.gender="male";
	   System.out.println(on.gender);
 
}
	public void emp(String n,int a) {
		System.out.println(n);
		System.out.println(a);
		
	}
}
