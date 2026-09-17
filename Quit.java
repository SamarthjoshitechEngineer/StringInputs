import java.util.Scanner;
public class Quit{
    public static void main(String[]args){
        boolean running=true;
        while(running){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int a=sc.nextInt();
System.out.println("Enter a second number");
int b=sc.nextInt();
int sum;
sum=a+b;
System.out.println("The sum of two numbers is"+sum);
System.out.println("Do you want to Quit from the program?");
char choice=sc.next().charAt(0);
if(choice=='Y'){
    System.out.println("Exiting......");
    running=false;
    System.exit(0);
}
System.out.println("____________________________!");
  
    }
}
}