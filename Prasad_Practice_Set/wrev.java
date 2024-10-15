// public class wrev {
//     public static void main(String[] args) {
//         int n=5472;
//         int r;
//         int count=0;
//         while(n!=0){
//             r=n%10;
//             System.out.print(r+" ");
//             n=n/10;
//             count++;


//         }
//         System.out.println(count);
//     }
    
// }

public class wrev {
    public static void main(String[] args) {
        int n=5472;
        int r;
        int x=0;
        while(n!=0){
            r=n%10;
            x=(x*10)+r;
            System.out.println(x+" ");
            n=n/10;
        }
        // System.out.println(x+" ");
    }
    
}
