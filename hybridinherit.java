import java.io.*;
import java.util.*;
class gparent
{
	void display()
	{
		System.out.println("GRAND PARENT");
	}
}
class father extends gparent
{
	void display1()
	{
		System.out.println("PARENT");
	}
}
interface mother
{
	void display2();
}
class child extends father implements mother
{
	public void display2()
	{
		System.out.println("CHILD FOR MOTHER AND FATHER");
	}
}
public class hybrid_inherit
{
	public static void main(String args[])
	{
		child c = new child();
		c.display();
		c.display1();
		c.display2();
	}
}
		










	