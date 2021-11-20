package day1;

public abstract class phone {
	// can not create object of abstract class
	// can not crete constructor 
	abstract void connectcall();// abstract method. 
	//phone obj =new phone();
public phone() {
	System.out.println("abstract class constructor");
}
public static void details() {
	System.out.println("Method with body");
}
public void Endcall() {
	
}
}
