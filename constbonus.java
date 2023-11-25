import java.io.*;
import java.util.*;
class bonus
{
	float sal,bon;
	bonus()
	{
		sal=0;
		bon=0;		
	}
	bonus(float a,float b)
	{
		sal=a;
		bon=b;
	}
	void display()
	{
		System.out.println("salary :"+sal);
		System.out.println("bonus :"+bon);
	}
}
public class const_bonus
{
	public static void main(String args[])
	{
		System.out.println("After Empty Constructor:");
		bonus b1=new bonus();
		b1.display();
		System.out.println("\nAfter Parameterized Constructor:");
		bonus b2=new bonus(20000.0f,2500.0f);
		b2.display();
	}
}																																																														