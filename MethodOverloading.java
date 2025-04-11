package firstPackage;
public class MethodOverloading 
{
	static void addition(double a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of decimal numbers is: "+sum);
	}
	static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of int numbers is: "+sum);
	}
	static void addition(int a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of int and double numbers is: "+sum);
	}
	static void addition(double a, int b)
	{
		double sum=a+b;
		System.out.println("Sum of double and int numbers is: "+sum);
	}
	static void addition(boolean b, String c, char d)
	{
		System.out.println("My name is: "+c);
		System.out.println(b+" "+c+" "+d);
	}
	void addition1(double a, double b)
	{
		double sum=a+b;
		System.out.println("Sum of decimal numbers is: "+sum);
	}
	void addition1(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of int numbers is: "+sum);
	}
	static void addition()
	{
		System.out.println("non-parameterized method");
	}
public static void main(String[] args) 
{
	addition(10,50);
	addition(10.20,25.0);
	addition(1,1.5);
	addition(2.5,1);
	addition(true,"Ashwini",'S');
	MethodOverloading m1=new MethodOverloading();
	m1.addition1(5, 10);
	m1.addition1(10.1, 11.1);
	addition();
	
}	
}

//que: how can we print two values in single sysout 