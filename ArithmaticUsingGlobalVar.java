package firstPackage;

public class ArithmaticUsingGlobalVar 
{
	static int a=300;
	static int b=200;

	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	static void mul()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int div=a/b;
		System.out.println(div);
	}
	static void mod()
	{
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}
}
