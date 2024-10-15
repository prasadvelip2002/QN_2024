import java.util.Scanner;

public class missingnum_n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n-1];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        int suma=0;
        for(int i=0;i<=a.length-1;i++){
            suma=suma+a[i];
        }
        System.out.println("the missing element is:");
        System.out.println(sum-suma);
        
    }
}