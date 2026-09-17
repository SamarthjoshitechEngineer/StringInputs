import java.util.Scanner;
public class Takinginput{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Enter a character");
char ch=sc.next().charAt(0);
sc.nextLine();
System.out.println("Enter a String(Full line)");
String s=sc.nextLine();
System.out.println("Enter a decimal number");
double a=sc.nextDouble();
System.out.println("Enter a float value");
float b=sc.nextFloat();
System.out.println("Enter a bololean");
boolean flag=sc.nextBoolean();
System.out.println(n);
System.out.println(ch);
System.out.println(s);
System.out.println(a);
System.out.println(b);
System.out.println(flag);
    }
}