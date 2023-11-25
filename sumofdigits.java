import java.io.*;
import java.util.*;
public class sumofdigits
{
public static void main(String args[])
{
int num,sod=0,rem;
Scanner s=new Scanner(System.in);
System.out.print("enter number :");
num=s.nextInt();
while(num>0)
{
rem=num%10;
sod=sod+rem;
num=num/10;
}
System.out.print("sum of digits :"+sod);
}}

