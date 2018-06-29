import java.io.*;
import java.util.*;
class maxi
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
max=a[0];
for(int i=0;i<n;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Enter number of arrays");
System.out.println("Enter the digits");
System.out.println("The entered number "+max+" is maximum");
}
}
