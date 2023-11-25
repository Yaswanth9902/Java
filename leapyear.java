import java.io.*;
public class leap
{
   public static void main(String args[])
   { 
       int year=1994;
       if((year%4==0)&&(year%100!=0)||(year%400==0))
       {
          System.out.println("LEAP YEAR");
       }
       else
       {
          System.out.println("NOT A LEAP YEAR");
       }
   }
}