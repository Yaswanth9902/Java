import java.io.*;
import java.util.*;
public class palindromestring
{
public static void main(String args[])
{
String str;
String rev="";
int n,i;
Scanner r=new Scanner(System.in);
System.out.print("enter string :");
str=r.nextLine();
n=str.length();
char ch[]=str.toCharArray();
for(i=n-1;i>=0;i--)
{
rev=rev+ch[i];
}
System.out.print("reverse :"+rev);
if(str.equals(rev))
{
System.out.println("\npalindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}