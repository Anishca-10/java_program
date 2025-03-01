import java.util.Scanner;
class arithmetic
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the a");
int a = obj.nextInt();
System.out.println("Enter the b");
int b = obj.nextInt();
System.out.println("a+b=" + (a+b));
System.out.println("a-b=" + (a-b));
System.out.println("a*b=" + (a*b));
System.out.println("a/b=" + (a/b));
System.out.println("a%b=" + (a%b));
}
}