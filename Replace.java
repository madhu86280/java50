import java.util.*;
class Replace
{
public static void main(String x[])
{
String y,z;
Scanner sc=new Scanner(System.in);
System.out.println("string:-");
y=sc.nextLine();
System.out.println("remove vowel from..." + y + ":-");
z=y.replaceAll("[aeiouAEIOU]","");
System.out.println("new string:-" + z);
}
}