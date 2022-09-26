import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s1 = scan.next();
        String s2 = scan.nextLine();
        scan.close();
        
        // Write your code here.

        System.out.println("String: " + s1 + s2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
