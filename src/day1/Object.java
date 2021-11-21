package day1;

public class Object {

	String name;// global variable or class variable
	public static int age =30;
	String gender;
	
	public static void main(String[] args) {
	   Object rajat = new Object();
	   rajat.emp("rajat", 20);
	   String msg = "This is java sir my program so i am happy";
	   int i =msg.indexOf("s");
	   int j = msg.indexOf("s", i+1);
	   int k = msg.indexOf("s", j+1);   
	  System.out.println(k);
	   
	   
 
}
	public void emp(String n,int a) {
		System.out.println(n);
		System.out.println(a);
		
	}
}
