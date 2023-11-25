import java.io.*;
import java.util.*;
class Grandparent
{
	int a=5,b=7;
	void display()
	{
		System.out.println("sum :"+(a+b));
	}
}
class parent extends Grandparent
{
	int c=4,d=8;
	void display1()
	{
		System.out.println("multiplication :"+(c*d));
	}
}
class child extends parent
{
	int e=9,f=3;
	void display2()
	{
		System.out.println("division :"+(e/f));
	}
}
public class multilevelinherit
{
	public static void main(String args[])
	{
		child c = new child();
		c.display();
		c.display1();
		c.display2();
	}
}
















