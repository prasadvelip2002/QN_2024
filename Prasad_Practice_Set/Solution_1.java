class Solution_1
{
    public static String is_palindrome(int n)
    {
        // Code here
        int x=0;
        int m=n;
        int r;
        while(n!=0){
            r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        if(m==x){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String args[]){
        int n=554;
        String ans = is_palindrome(n);
        System.out.println(ans);
    }
}