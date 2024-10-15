
// User function Template for Java
class Solution {
    static long isSumPalindrome(long n) {
        // code here
        
        
        int a=0;
        long b=-1;
        while(true)
        {
            //int a=0;
            //long b=-1;
            
            
            long copy=n;
            long sum=0;
            
            while(n!=0)
            {
                long rem=n%10;
                sum=(sum*10)+rem;
                n=n/10;
            }
            if(sum==copy)
            {
                return sum;
            }
            else{
                long s=sum+copy;
            String s1="";
            s1=s1+s;
            
            int count=0;
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==s1.charAt(s1.length()-1-i))
                {
                    count++;
                }
            }
            if(count==s1.length())
            {
                return s;
            }
            else{
                n=s;
                
            }
            }
            
            a++;
            if(a>=5)
            {
               return b; 
            }
            
        }
    }
}