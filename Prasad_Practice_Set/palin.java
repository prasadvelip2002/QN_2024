
public class palin {
    public static void main(String[] args) {
        int n=73;
        //int ans =
         palindrome(n);
       // System.out.println(ans);
        // System.out.println();
    }
    static void palindrome(int n){
        int x=0;
        int r,m=n;
        while (n!=0) {
            r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        int sum=m+x;
        // String s="";
        // s=s+sum;
        // System.out.println(s);
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)==s.charAt(s.length()-1-i))
        //     {
        //         System.out.println("palindrome");
        //     }
        //     else
        //     {
        //         System.out.println("Not a palindrome");
        //     }
        // }
       // System.out.println(s);
      //  return sum;
        
    }
    
    
}
