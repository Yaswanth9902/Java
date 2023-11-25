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
class ch1 extends parent
{
	int c=4,d=8;
	void display1()
	{
		System.out.println("multiplication :"+(c*d));
	}
}
class ch2 extends parent
{
	int e=9,f=3;
	void display2()
	{
		System.out.println("division :"+(e/f));
	}
}
class ch3 extends parent
{
	int g=6,h=1;
	void display3()
	{
		System.out.println("subtraction :"+(g-h));
	}
}
public class hierarichalinherit
{
	public static void main(String args[])
	{
		ch3 c = new ch3();
		c.display();
		c.display3();
		ch2 c1 = new ch2();
		c1.display2();
		ch1 c2 = new ch1();
  		c2.display1();
	}
}
















