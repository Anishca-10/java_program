import java.util.Scanner;

public class assignmentoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        
        a += b; 
        System.out.println("After a += b, a = " + a);
        a = scanner.nextInt();
        
        a -= b;
        System.out.println("After a -= b, a = " + a);
         a = scanner.nextInt();
        
        
        a *= b; 
        System.out.println("After a *= b, a = " + a);
        a = scanner.nextInt();
        
        a /= b; 
        System.out.println("After a /= b, a = " + a);
        a = scanner.nextInt();
    
        a %= b; 
        System.out.println("After a %= b, a = " + a);

       
        scanner.close();
    }
}
