package firstPackage;
public class MainMethod_overloading
{

public static void main(String[] args) 
{
	System.out.println("Main method");
	main();
	main("Ashwini", 'F');
	MainMethod_overloading c1=new MainMethod_overloading();
	c1.main("Ashwini");
}

public static void main() 
{
	System.out.println("Main method with no arguments");
}
public static void main(String name, char gender) 
{
	System.out.println("Main method with arguments: "+name+" and "+gender);
}
public void main(String name) 
{
	System.out.println("Non Static Main method with argument: "+name);
}

}
