package firstPackage;

import java.util.Date;

public class Future_Time 
{
public static void main(String[] args) 
{
	Date d1=new Date();					
	long l1=d1.getTime();
	System.out.println("Epoch Time: "+l1);
	
	Date d=new Date(d1.getTime());
	System.out.println("Current time: "+d);
	
	Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
	System.out.println("Future time after 1 day: "+d2);
	
	Date d3=new Date(d1.getTime()+(1000*60*60*24*3));
	System.out.println("Future time after 3 days: "+d3);
	
}
}
