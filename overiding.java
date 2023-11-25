import java.io.*;
import java.util.*;
class A1
{
	 void disp()
	{
		System.out.println("SUPER CLASS");
	}
}
class B1 extends A1
{
	void disp()
	{
		System.out.println("SUB CLASS");
	}
}
public class overiding
{
	public static void main(String args[])
	{
		B1 b=new B1();
		b.disp();
	}
}