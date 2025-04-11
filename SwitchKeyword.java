package firstPackage;

import java.util.Scanner;

public class SwitchKeyword 
{

public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Please enter 1 for chrome");
	System.out.println("Please enter 2 Firefox");
	System.out.println("Please enter 3 for Edge");
	System.out.println("Please enter 4 for Safari");
	int input=s1.nextInt();
	
	switch(input) //OR switch(1/2/3/4..)   here 1/2/3.. are case numbers
	{
	case 1: System.out.println("Launching Chrome Browser");
	        break;
	case 2: System.out.println("Launching Firefox Browser");
    		break;  
	case 3: System.out.println("Launching Edge Browser");
    		break;		
	case 4: System.out.println("Launching Safari Browser");
    		break;	
    default:
    	System.out.println("Your Selection is Wrong, Can you try again please");
	}
s1.close();
}
}
