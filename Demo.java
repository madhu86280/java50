import java.util.*;
public class Demo
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String a=sc.nextLine();
int count=1;
for(int i=0;i<a.length() -1;i++)
{
if((a.charAt(i)== ' ')&&(a.charAt(i+1)!=' '))
{
count++;
}
}
System.out.println("no. of words=" + count);
}
}