import java.util.Scanner;

public class AB10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n-1];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=a.length-2;i++){
            if(a[i-1] % a[i] == 0 && a[i+1] % a[i] == 0 ){
                System.out.print(a[i]+" ");
            }
        }
    }
}