import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the max is:");
        int max=a[0];
        System.out.println();
        System.out.println("the min is:");
        int min=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(a[i]>max){
               max=a[i];
            }
            if(a[i]<min){
                min=a[i];
             }
        }
        System.out.println(max);
        // System.out.println("the min is:");
        // int min=a[0];
        // for(int i=0;i<=a.length-1;i++){
        //     if(a[i]<min){
        //        min=a[i];
        //     }
        // }
        System.out.println(min);
    }
    
}
