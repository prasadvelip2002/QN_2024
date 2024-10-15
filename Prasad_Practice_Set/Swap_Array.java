import java.util.Scanner;

public class Swap_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[] = new int[n];
        // int b[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int mid=a[2];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]<a[mid+1]){
                int temp=a[i];
                a[i]=a[mid+1];
                a[mid+1]=temp;
            }
            System.out.print(a[i]+" ");
        }
       
    }
    
}
