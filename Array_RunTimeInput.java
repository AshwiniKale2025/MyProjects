package firstPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Array_RunTimeInput 
{
public static void main(String[] args) 
{
	int rollno[]=new int[4];
	Scanner s1=new Scanner(System.in);
	
	rollno[0]=s1.nextInt();
	rollno[1]=s1.nextInt();
	rollno[2]=s1.nextInt();
	rollno[3]=s1.nextInt();
	//OR
	for(int i=0; i<4;i++)
	{
		rollno[i]=s1.nextInt();
	}
	System.out.println(Arrays.toString(rollno));
	
	s1.close();
}
}
