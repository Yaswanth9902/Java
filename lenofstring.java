import java.io.*;
import java.util.Scanner;
public class lenofstring
{
public static void main(String args[])
{
String str;
int len=0;
Scanner l=new Scanner(System.in);
System.out.print("enter a string :");
str=l.nextLine();
char a[]=str.toCharArray();
for(char ch:a)
{
len++;
}
System.out.print("length of string :"+len);
}
}