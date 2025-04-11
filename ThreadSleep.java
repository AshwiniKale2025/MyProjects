package firstPackage;

public class ThreadSleep
{

	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Math.random());
			System.out.println("Ashwini");
			Thread.sleep(3000);       //3000 miliseconds
		}
	}
}

