package firstPackage;

public class StringFunction_MatchesIMP
{
public static void main(String[] args) 
{
	//check if the given string has exact 3 letters in it
	String name="cat";
	boolean b1=name.matches("...");
	System.out.println(b1);
	boolean b2=name.matches("....");
	System.out.println(b2);
	
	//In a given string "cat" check if the string starts with letter "c"
	boolean b3=name.matches("c(.*)");
	System.out.println(b3);
	boolean b4=name.matches("m(.*)");
	System.out.println(b4);
	
	//In a given string "cat" check if the string ends with letter "t"
	boolean b5=name.matches("(.*)t");
	System.out.println(b5);
	
	//in the given string "manish" check if "n" is present or not
	String a1="manish";
	boolean b6=a1.matches("(.*)n(.*)");
	System.out.println(b6);
	
	
	
	
	
	
	//(.*): this is regix expression
}
}
