package day1;

public class Callingclass {

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.Sum(1, 2);
	//Statics and Non statics
		System.out.println(obj.Sum(1, 2));
		System.out.println(Methods.marks(1,2));
		
		
		
		

	}

}
