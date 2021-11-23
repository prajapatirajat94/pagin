package day1;

import java.util.ArrayList;

public class PARENTS {
String name;
	int dob;
	ArrayList<String>carfeature;
	
	public static void main(String[] args) {
		ArrayList<String>rajatcardetails = new ArrayList<String>();
		rajatcardetails.add("hyundai");
		rajatcardetails.add("Elantra");
		rajatcardetails.add("2017");
		PARENTS emp1 = new PARENTS("Rajat",19,rajatcardetails);
		System.out.println(emp1.name);
		System.out.println(emp1.dob);
		System.out.println(emp1.carfeature);
}
	public PARENTS() {
		System.out.println("Parent class defult constructor");
	}
	public PARENTS(String name,int dob,	ArrayList<String>carfeature) {
		this.name = name;
		this.dob = dob;
		this.carfeature=carfeature;
	}
	
}
