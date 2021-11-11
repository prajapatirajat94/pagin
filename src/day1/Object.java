package day1;

public class Object {

	String name;// global variable or class variable
	int age;
	String gender;
	
	public static void main(String[] args) {
	   
		int a; // local variable 
		Object obj = new Object();
		obj.age =30;
		obj.gender ="male";
		obj.name = "Allen";
		Object obj1 = new Object();
		obj1.age = 20;
		obj1.gender = "female";
		obj1.name ="Dora";
		
		 Object obj2=new Object();
       System.out.println(obj1.name);
	}
 
}
