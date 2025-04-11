package firstPackage;

public class NestedIfElse
{

	public static void main(String[] args) 
	{
		char gender1='M';
		char gender2='F';
		int age=10;
		if(gender1=='M')
		{
				if(age>12)
				{
					System.out.println("Adult fare");
				}
				else
				{
					System.out.println("Half Ticket");
				}
		}
		else
		{
			if(age>12)
			{
				System.out.println("Adult fare");
			}
			else
			{
				System.out.println("Half Ticket");
			}
			System.out.println("Its Free for Females");
		}
		
		
		//OR
		
		if(gender2=='F')
		{
				if(age>5)
				{
					System.out.println("Half ticket for ladies");
				}
				else
				{
					System.out.println("No Tickets for kids less than age 5 years");
				}
		}
		else
		{
			if(age>12)
			{
				System.out.println("Adult fare for Male");
			}
			else
			{
				System.out.println("Half Ticket for kids below 12");
			}
			System.out.println("Its Free for Females");
		}
	
	
	}
}
