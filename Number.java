import java.util.*;
public class Number
{
public static void main(String x[])
{
String m1,m2;
Scanner sc=new Scanner(System.in);
System.out.println("first string:-");
m1=sc.nextLine();
System.out.println("second string:-");
m2=sc.nextLine();
int c=-1;
c=m1.lastIndexOf(m2);

if(c>=0)
{
System.out.println("true");
}
else
System.out.println("false");

}
}