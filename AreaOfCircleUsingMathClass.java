package firstPackage;

public class AreaOfCircleUsingMathClass 
{
	static final double pivalue=Math.PI;
	
public static void main(String[] args) 
{
	double radius=Math.random();
	double area=pivalue*radius*radius;
	System.out.println(area);
	//OR
	double area2=Math.PI*radius*radius;
	System.out.println(area2);
}
}
