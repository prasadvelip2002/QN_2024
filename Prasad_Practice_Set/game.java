import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int k[] = new int[n];
        int anil=0;
        int kiran=0;
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            k[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>k[i]){
                anil++;
            }else if(k[i]>a[i]){ 
                kiran++;
            }
        }
        if(anil>kiran){
            System.out.println("anil");
        }else if(kiran>anil){
            System.out.println("kiran");
        }else{
            System.out.println("Draw");
        }
    }
    
}
