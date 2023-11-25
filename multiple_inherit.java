import java.io.*;
import java.util.*;
interface father
{
	int x=10;
	void display();
}
class mother
{
	int y=8;
	void display1()
	{
		System.out.println("2nd value :"+y);
	}
}
class child extends mother implements father
{
	public void display()
	{
		System.out.println("1st value :"+x);
	}
}
public class multiple_inherit
{
	public static void main(String args[])
	{
		child c =  new child();
		c.display();
		c.display1();
	}
}







