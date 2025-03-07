import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the a value:");
        int a = obj.nextInt();
        System.out.print("enter the b value:");
        int b = obj.nextInt();
        System.out.print("enter the b value:");
        int c = obj.nextInt();
        System.out.println("AND:"+(a&b));
        System.out.println("OR:"+(a|b));
        System.out.println("XOR:"+(a^b));
        System.out.println("left shift:"+(c<<2));
        System.out.println("right shift:"+(c>>2));
        
    }
}