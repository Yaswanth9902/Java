import java.io.*;
import java.util.*;
class report
{
	float s1,s2,s3,s4,s5,total,avg;
	report()
	{	
		s1=s2=s3=s4=s5=0;
		total=avg=0;
	}
	report(float a,float b,float c,float d,float e)
	{
		s1=a;
		s2=b;
		s3=c;
		s4=d;
		s5=e;
	}
	void calc()
	{
		total=s1+s2+s3+s4+s5;
		avg=total/5;
	}
	void display()
	{
		System.out.println("total marks:"+total);
		System.out.println("average marks:"+avg);
		if(avg>=90)
			System.out.println("A grade");
		else if(avg>=80&&avg<90)
			System.out.println("B grade");
		else if(avg>=70&&avg<80)
			System.out.println("C grade");
		else if(avg>=60&&avg<70)
			System.out.println("D grade");
		else if(avg>=50&&avg<60)
			System.out.println("E grade");
		else
			System.out.println("Fail");
	}
}
public class const_streport
{
	public static void main(String args[])
	{
		report r1=new report();
		r1.calc();
		r1.display();
		System.out.println("\nAfter parameterized constructor :");
		report r2=new report(86.5f,76.5f,69.5f,94.6f,78.1f);
		r2.calc();
		r2.display();
	}
}




















				