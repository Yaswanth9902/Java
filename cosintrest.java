import java.io.*;
import java.util.*;
class sintrest
{
int age;
float si,pa,noy;
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("Enter age :");
age=s.nextInt();
System.out.println("Enter principle amount :");
pa=s.nextFloat();
System.out.println("Enter no of years :");
noy=s.nextFloat();
}
void calc()
{
if(age>=60)	
{
si=(pa*noy*12)/100;
}
else
{
si=(pa*noy*10)/100;
}
}
void display()
{
System.out.println("Simple Intrest :"+si);
}
}
public class co_sintrest
{
public static void main(String args[])
{
sintrest i=new sintrest();
i.getdata();
i.calc();
i.display();
}
}
    







