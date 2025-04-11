package firstPackage;

import java.util.Date;

public class Current_Time 
{
public static void main(String[] args) 
{
	Date d1=new Date();					//Date class: pre-defined class in java.util package
	long l1=d1.getTime();
	System.out.println("Epoch Time: "+l1);
	
	//o/p is 1730803876987 called as "Epoch time". we need to convert it by using epoch time converter in google
	
	Date d2=new Date(d1.getTime());
	System.out.println("Human Understandable time: "+d2);
	
	
	//with the help of below method we can convert anything in String
	String d3=d2.toString();
	String month=d3.substring(4, 7);
	System.out.println("Month: "+month);
	String year=d3.substring(d3.length()-4);
	System.out.println("Year: "+year);
	String date=d3.substring(8,10);
	System.out.println("Date: "+date);
	
	String dateFormat=date.concat(month).concat(year);
	System.out.println(dateFormat);
	String dateFormat1=date.concat(" ").concat(month).concat(" ").concat(year);
	System.out.println(dateFormat1);
	String dateFormat2=date.concat("-").concat(month).concat("-").concat(year);
	System.out.println(dateFormat2);
	String dateFormat3=date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(dateFormat3);

	
	//try below for current time(my finding)
	/*Date d1=new Date();					
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	*/
}
}
