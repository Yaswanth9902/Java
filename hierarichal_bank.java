import java.io.*;
import java.util.*;
class bank
{
	void display()
	{

		System.out.println("Rate of intrest in this bank for simple intrest :");
	}
}
class sbi extends bank
{
	float sbiroi=8.4f;
	void display1()
	{
		System.out.println("Rate of intrest in SBI bank:"+sbiroi);
	}
}
class ici extends bank
{
	float iciroi=7.3f;
	void display2()
	{
		System.out.println("Rate of intrest in ICI bank:"+iciroi);
	}
}
class icici extends bank
{
	float iciciroi=9.7f;
	void display3()
	{
		System.out.println("Rate of intrest in ICICI bank:"+iciciroi);
	}
}
class axis extends bank
{
	float axisroi=7.9f;
	void display4()
	{
		System.out.println("Rate of intrest in AXIS bank:"+axisroi);
	}
}
public class hierarichal_bank
{
	public static void main(String args[])
	{
		sbi s = new sbi();
		s.display();
		s.display1();
		ici i = new ici();
		i.display();
		i.display2();
		icici ic = new icici();
		ic.display();
		ic.display3();
		axis a = new axis();
		a.display();
		a.display4();
	}
}






