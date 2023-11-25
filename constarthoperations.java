import java.io.*;
import java.util.*;
class arth
{
	float x,y;
	arth()
	{
		x=0;
		y=0;
	}
	arth(float a,float b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println("Addition :"+(x+y));
		System.out.println("Substraction :"+(x-y));
		System.out.println("Multiplication :"+(x*y));
		System.out.println("Division :"+(x/y));
	}
}
public class const_arthoperations
{
	public static void main(String args[])
	{
		arth a1=new arth();
		a1.display();
		System.out.println("\nAfter parameterized constructor :");
		arth a2=new arth(20.0f,4.0f);
		a2.display();
	}
}
