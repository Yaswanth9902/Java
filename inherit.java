import java.io.*;
import java.util.*;
class parent
{
	int a=5,b=7;
	void display()
	{
		System.out.println("sum :"+(a+b));
	}
}
class child extends parent
{
	int c=4,d=8;
	void display1()
	{
		System.out.println("multiplication :"+(c*d));
	}
}
public class inherit
{
	public static void main(String args[])
	{
		child c = new child();
		c.display();
		c.display1();
	}
}
















