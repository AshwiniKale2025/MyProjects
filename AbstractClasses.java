package firstPackage;

abstract class Class3
{
	abstract void method1();		//abstract method
	abstract void method2();		//abstract method
	void method4()					//concrete method
	{
		System.out.println("Logic for logout from system");
	}
	
}
abstract class Class2 extends Class3
{
	abstract void method3();		//abstract method
	abstract void method5();		//abstract method
}

public class AbstractClasses extends Class2
{
public static void main(String[] args) 
{
	AbstractClasses a1=new AbstractClasses();
	a1.method4();
}


@Override
void method3() 						//concrete method
{
	// TODO Auto-generated method stub
	
}

@Override
void method5() 						//concrete method
{
	// TODO Auto-generated method stub
	
}

@Override
void method1() 						//concrete method
{
	// TODO Auto-generated method stub
	
}

@Override
void method2() 						//concrete method
{
	// TODO Auto-generated method stub
	
}
}
