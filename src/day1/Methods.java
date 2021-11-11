package day1;

public class Methods {
	//Static variable
	static int b =10;

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.details();
		
            
            //Direct calling
            marks(1,2);
            
            //Calling with class name
            Methods.marks(2,3);     
            // calling static variable 
            System.out.println(Methods.b);
             obj.Sum(4, 5);
             System.out.println(obj.Sum(4, 5));
	}
	public void details() {	// Method with no return type when use void there is no return
		System.out.println("employment details ");
	}
	// METHOD WITH RETURN TYPE
	public static int marks(int a,int b) {
		int c =a+b;
		return c;	
	}
	//METHOD WITH RETURN TYPES AND ARGUEMENTS/PARAMETER sum(2,3)=5
	public int Sum(int a, int b ) {
		int result = a+b;
		return result;
	}
	
	
}
