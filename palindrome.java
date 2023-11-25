import java.io.*;
import java.util.*;
public class palindrome
{
public static void main(String args[])
{
int num,rev=0,rem,temp;
Scanner s=new Scanner(System.in);
System.out.print("enter number :");
num=s.nextInt();
temp=num;
while(num>0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
if(temp==rev)
{
System.out.print("palindrome");
}
else
{
System.out.print("not a palindrome");
}
}
}