package day1;

public class constructorexample {
String name;
int age;
int deptno;
	public static void main(String[] args) {
		constructorexample obj = new constructorexample("Rajat",20, 21 ); /* passed construction parametere 
		in statement instead of writing code for each variable it reduce the line of code
		*/
		
		
	}
	public constructorexample() { // default constructor no need to declare in main method 
		System.out.println("its my browser");
	
	}
	public constructorexample(String name , int age, int deptno) { /* like overloadingconstrutor same as 
	                                                                method overloading */
	//This.classvariable = localvariable/ parameter 
		this.deptno = deptno; /* assigned value to class varible from local variable
		name is same. initializing global variable with THIS variable
		*/
		System.out.println(name);
		System.out.println(age);
		System.out.println(deptno);
	}

}
