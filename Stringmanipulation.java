import java.util.Scanner;
public class Stringmanipulation {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println(s);
System.out.println("enter a string");
String s1=sc.nextLine();
System.out.println(s1);
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s1.equals(s));
System.out.println(s1.equalsIgnoreCase(s));
String replaced=s.replace('A','o');
System.out.println(replaced);

    }
}
