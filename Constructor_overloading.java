package firstPackage;
public class Constructor_overloading
{
	Constructor_overloading()			//1st constructor
	{
		System.out.println("1st");
	}
	Constructor_overloading(int a)
	{
		System.out.println("2nd"+a);		//2nd constructor
	}
	Constructor_overloading(int a,int b)
	{
		System.out.println("3rd"+a+b);		//3rd constructor
	}
	
public static void main(String[] args) 
{
	new Constructor_overloading();
	new Constructor_overloading(500);
	new Constructor_overloading(500,100);	
}	
}
