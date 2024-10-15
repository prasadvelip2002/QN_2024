import java.util.HashSet;
import java.util.LinkedHashSet;

public class Pangram {
    public static void main(String[] args) {
        
        HashSet<Character>hash=new LinkedHashSet<>();
       // String s="The quick brown fox jumps over the lazy dog";
       String s="This is a simple test.";
        s=s.toLowerCase();
        //System.out.println(s);

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                hash.add(s.charAt(i));
            }
        }

        if(hash.size()==26)
        {
            System.out.println("It's a panagram");
        }
        else{
            System.out.println("Not a panagram");
        }
        System.out.println("***************************************");
        System.out.println(hash.size());
        System.out.println(hash);
    }
}
