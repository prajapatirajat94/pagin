package arry.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraycln {

	public static void main(String[] args) throws Exception {
		ArrayList <String>ar = new ArrayList<String>();
		ar.add("rajat");
		ar.add("kamal");
		ar.add("naveen");
		ar.add("cheena");
		ArrayList<String>arcln = new ArrayList<String>(Arrays.asList("Bharat","Ranjan"));
		System.out.println(arcln);	
		// Reverse string concept
		System.out.println(Reversestring("R"));
	}
public static  String Reversestring(String enter) {
	int len = enter.length();
	if(enter.length()==1) {
		return enter;
	}
	String rev = "";
	for(int i = len-1;i>=0;i--) {
		rev = rev + enter.charAt(i);
	}
	return rev;
}

}
