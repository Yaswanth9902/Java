import java.io.*;
import java.util.*;
public class days
{
public static void main(String args[])
{
int noofdays,years,months,weeks,rdays,a,b,c;
Scanner d=new Scanner(System.in);
System.out.println("enter no of days :");
noofdays=d.nextInt();
years=noofdays/365;
a=noofdays%365;
months=a/30;
b=a%30;
weeks=b/7;
c=b%7;
rdays=c;
System.out.println("no of years :"+years);
System.out.println("no of months :"+months);
System.out.println("no of weeks :"+weeks);
System.out.println("no of days :"+rdays);
}
}