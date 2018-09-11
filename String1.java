
import java.util.*;

class String1
{
public static void main(String x[])
{
String sub,z;
int i,c,length;
Scanner in=new Scanner(System.in);
System.out.println("string:-");
sub = in.nextLine();
length = sub.length();
System.out.println("sub string of:-" + sub + "is");
for(c=0;c<length;c++)
{
for(i=0;i<=length-c;i++)
{
z=sub.substring(i,i+c);
System.out.println(z);
}
}

}
}