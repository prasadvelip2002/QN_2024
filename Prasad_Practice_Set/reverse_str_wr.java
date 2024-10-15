import javax.print.DocFlavor.STRING;

public class reverse_str_wr {
    public static void main(String[] args) {
        
        String s="quntnex is best";
        String ans="";
        //int sum=0;
        for(int i=0;i<s.length();i++)
        {   int sum=0;
            if(s.charAt(i)!=' ')
            {
                sum=s.charAt(i)+3;
            }

            
                if(sum>122)
                {
                    sum=96+(int)(s.charAt(i)%122);
                }

            ans+=(char)(sum);
            
        }
        System.out.println(ans);
    }   
}
