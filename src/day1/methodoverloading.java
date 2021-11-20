package day1;

public class methodoverloading { // class declaration

	public static void main(String[] args) { // Main method
	methodoverloading obj = new methodoverloading();
	obj.sum(1, 2);
	obj.sum(1);
	System.out.println(obj.sum(1, 2));
	System.out.println(obj.sum(1));
	
}
	public int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	public int sum(int a) {
		return a;		
	}
}