package day1;

public class samsung extends phone   { /* need to extend class like parents class if you want to call 
                         method from abstract class */

	public static void main(String[] args) {
		phone obj = new samsung();
		obj.connectcall();
		
		
		
		


}

@Override
void connectcall() {
	System.out.println("its my phone");
	
}

}
