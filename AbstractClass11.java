package firstPackage;
abstract class Google_Auth			//Abstract class
{
	abstract void login();			//Abstract method
	abstract void registration();	//Abstract method
}


public class AbstractClass extends Google_Auth
{

public static void main(String[] args) 
{
	AbstractClass a1=new AbstractClass();
	a1.login();
}


@Override
void login() 							//concrete method
{
	// TODO Auto-generated method stub
	System.out.println("Login");
}

@Override
void registration() 					//concrete method
{
	// TODO Auto-generated method stub
	System.out.println("Registration");
}


}
