package firstPackage;
interface Amazon
{
	void login();
	void registration();
}

public class Interface implements Amazon
{
public static void main(String[] args) 
{
	Interface a1=new Interface();
	a1.login();
	a1.registration();
}


//all the methods in interface are by default public
@Override
public void login() {
	// TODO Auto-generated method stub
	System.out.println("Real Login Logic");
}

@Override
public void registration() {
	// TODO Auto-generated method stub
	System.out.println("Real Registration Logic");
}	
}
