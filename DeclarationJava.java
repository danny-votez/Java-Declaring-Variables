// In this example we are explaining the declaration of variables in Java
// The features shown are int, final int, i.e., unchangeable, float, and String

public class DeclarationJava {
	public static void main(String[] args){
	String name = "Daniel";
	int myNum = 1;
	final int myValue = 29;
	float timeRun = 9.345f;
	System.out.println("My name is: "+ name);
// To concatenate variables and strings, in this case, we use the + operator
// Note, in Java, all statements must end with a semi-colon ;
	System.out.println("In the class, my Number was: "+ myNum);	
	System.out.println("And currently my Age in Years is: " + myValue);
	System.out.println("My time in School race was: "+ timeRun);
	System.out.println("|----------It is Amazing!--------------|");
	}
}