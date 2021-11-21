package day1;

public class child extends PARENTS    { // we have inharited property of parents

	public static void main(String[] args) {
		
		child obj = new child();
		obj.PARE();		
		
		
			
	}
		public child() {
			
		
			System.out.println("i am from child x");
		}
		
		public void PARE() {
			System.out.println("with out parameter child cx");
		}
}