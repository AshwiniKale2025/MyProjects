package firstPackage;
public class NonStaticMethod 
{
	void addition()					//non static method
	{
		System.out.println("Adding two numbers");
	}
	void subtraction()
	{
		System.out.println("Subtracting two numbers");
	}
	public static void main(String[] args) 
	{
		System.out.println("My Main method");
		
		//calling non-static method
		NonStaticMethod n1=new NonStaticMethod();    //creating an object
		n1.addition();								//calling non-static method with the help of ref var
		n1.subtraction();
	}
}
