import java.io.*;
import java.util.*;
class vowcon
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int i=0;
System.out.print("Enter the character:");
char ch=sc.next().charAt(0);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
i++;
}
if(i==1)
{
System.out.println("Entered character "+ch+" is vowel"); 
}
else
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println("Entered character "+ch+" is consonant");
}
else
{
System.out.println("not an alphabet");
}
}
}
