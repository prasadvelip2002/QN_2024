import java.util.Scanner;
import java.util.StringTokenizer;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s1 = sc.next();
        System.out.println("enter the string with character(s) where tokenization should take place:");
        String s2 = sc.next();
        StringTokenizer stk;
        stk= new StringTokenizer(s1,s2);
        System.out.println("The tokens are:");
        while (stk.hasMoreTokens()) {
            String t = stk.nextToken();
            System.out.println(t);            
        }

    }
    
}
