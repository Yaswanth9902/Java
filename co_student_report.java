import java.io.*;
import java.util.*;
class studentreport
{
String name;
float s1,s2,s3,s4,s5,total,avg;
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("Enter name :");
name=s.nextLine();
System.out.println("Enter marks in 5 subjects :");
s1=s.nextFloat();
s2=s.nextFloat();
s3=s.nextFloat();
s4=s.nextFloat();
s5=s.nextFloat();
}
void calc()
{
total=s1+s2+s3+s4+s5;
avg=total/5;
System.out.println("Total marks :"+total);
System.out.println("Average marks :"+avg);
}
void display()
{
if(avg<=50)
{
System.out.println("Fail");
}
else
{
if(avg>=90)
{
System.out.println("A+ grade");
}
else if(avg>=81&&avg<90)
{
System.out.println("A grade");
}
else if(avg>=71&&avg<=80)
{
System.out.println("B grade");
}
else if(avg>=61&&avg<=70)
{
System.out.println("C grade");
}
else
{
System.out.println("E grade");
}
}
}
}
public class co_studentreport
{
public static void main(String args[])
{
studentreport r=new studentreport();
r.getdata();
r.calc();
r.display();
}
}











