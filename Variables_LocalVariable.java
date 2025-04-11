/*
 1. Local Variables: Any variable declared inside any method is a local variable
 eg.
 	PSVM
 	{
 		byte b=100;
 	}
 i. The scope of local variable is going to be from start of the method 
 	till the end of the method.Outside the method we can't be able to utilize it.	
 ii. Local variable can never be distinguish between static and non-static.
 iii. Local variable can never be utilized untill it is initialized.
 iv. Local variable will never have any default values in it

 */
package firstPackage;

public class Variables_LocalVariable 
{
	void add()
	{
		int a;					//Declaration
		a=10;					//Initialization
		int age=10;					//Local variable
		System.out.println(a);
		
	}
public static void main(String[] args) 
{
	
}
}
