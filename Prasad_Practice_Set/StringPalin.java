import java.util.Scanner;

public class StringPalin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();

        boolean ispalindrome = true;
        int length =  str.length();
        
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                ispalindrome = false;
                break;
            }
        }
        System.out.println("The original string is:"+str);

        if(ispalindrome){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}