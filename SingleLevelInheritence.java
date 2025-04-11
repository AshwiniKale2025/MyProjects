package firstPackage;

class One				//parent class
{
	static void add()
	{
		System.out.println("add");
	}
	 void sub()
	{
		System.out.println("sub");
	}
}
public class SingleLevelInheritence extends One 	//child class
{
	static void mul()
	{
		System.out.println("mul");
	}
	 void div()
	{
		System.out.println("div");
	}

public static void main(String[] args) 
{
	SingleLevelInheritence s1=new SingleLevelInheritence();
	mul();
	s1.div();
	add();
	s1.sub();
}	
}
