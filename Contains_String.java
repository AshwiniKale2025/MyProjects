
package firstPackage;

public class Contains_String 
{
public static void main(String[] args) 
{
	String input="Ashwini Swapnil Kale";
	
	//for reverse string if input is combination of uppercase and lowercase then use below
	String input1=input.toLowerCase();
	System.out.println(input1);
	
	
	boolean b1=input.contains("Kale");
	System.out.println(b1);
	
	boolean b2=input.contains("kale");
	System.out.println(b2);
	
}
}
