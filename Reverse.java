import java.util.*;
class Reverse
{
public static void main(String x[])
{
String y,reverse="";
Scanner in=new Scanner(System.in);
System.out.println("Enter a string");
y=in.nextLine();
int length=y.length();
for(int i=length-1;i>=0;i--)
reverse=reverse + y.charAt(i);
System.out.println("reverse:-"+reverse);
}

}