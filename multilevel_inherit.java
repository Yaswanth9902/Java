import java.io.*;
import java.util.*;
class father
{
	void display()
	{
		System.out.println("FATHER CLASS");
	}
}
class mother
{
	void display1()
	{
		System.out.println("MOTHER CLASS");
	}
}
class child extends mother extends father
{
	void display2()
	{
		System.out.println("CHILD CLASS");
	}
}
public class multiple_inherit
{
	public static void main(String args[])
	{
		child c = new child();
		c.display();
		c.display1();
		c.display2();
	}
}







