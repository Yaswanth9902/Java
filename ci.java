import java.io.*;
import java.util.*;
public class ci
{
	public static void main(String args[])
	{
		float p,r,n,ci;
		Scanner s=new Scanner(System.in);
		System.out.println("enter principle amount,rate of intrest,no of years:");
		p=s.nextFloat();
		r=s.nextFloat();
		n=s.nextFloat();
		ci=(((1+(r/100))*(1+(r/100)))*p)-p;  
		System.out.println("compound intrest :"+ci);
	}
}
		