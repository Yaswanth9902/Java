import java.io.*;
import java.util.*;
class math
{	
	void sum()
	{
		System.out.println("Method overloading");
	}
	int sum(int x)
	{
		return x*x;
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	float sum(float y)
	{
		return y+y;
	}
	float sum(float m,float n)
	{
		return m-n;
	}
	float sum(int c,float d)
	{
		return c/d;
	}
}
public class methodoverload
{
	public static void main(String args[])
	{
		math m=new math();
		m.sum();
		System.out.println(m.sum(10));
		System.out.println(m.sum(10,54));
		System.out.println(m.sum(5.5f));
		System.out.println(m.sum(10.2f,10.0f));
		System.out.println(m.sum(10,5.0f));
	}
}




