import java.util.Scanner;

public class palindrome_ps {
    public static void main(String[] args) {
        int n=554;
        int r,m=n;
        int x=0;
        while (n!=0) {
            r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        if(m==x){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    
}
