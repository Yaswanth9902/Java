import java.io.*;
import java.util.*;
class product
{
int n,i;
float rate[]=new float[100];
float qty[]=new float[100];
String pd[]=new String[100];
Scanner s=new Scanner(System.in);
void getdata()
{
System.out.println("enter no of products:");
n=s.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Product Description:");
pd[i]=s.nextLine();
System.out.println("Product Rate:");
rate[i]=s.nextFloat();
System.out.println("Product Quantity:");
qty[i]=s.nextFloat();
}
}
void display()
{
for(i=0;i<n;i++)
{
System.out.println();
System.out.println("Product Description:"+pd[i]);
System.out.println("Product Rate:"+rate[i]);
System.out.println("Product Quantity:"+qty[i]);
System.out.println("Total price:"+(rate[i]*qty[i]));
}
}
}
public class co_invoicereport
{
public static void main(String args[])
{
product p=new product();
p.getdata();
p.display();
}
}












