import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2 != 0){
               System.out.print(a[i]+" ");
            }
        }
    }
    
}
