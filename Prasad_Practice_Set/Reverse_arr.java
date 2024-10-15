// import java.util.Scanner;

// public class Reverse_arr {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the array size:");
//         int n = sc.nextInt();
//         int a[]=new int[n];
//         System.out.println("enter the array elements:");
//         for(int i=0;i<=a.length-1;i++){
//             a[i] = sc.nextInt();
//         }
//         int j=a.length-1;
//         for(int i=0;i<=a.length-1;i++){
//             if(a[i]<a[j]){
//                 int temp=a[j];
//                 a[j]=a[i];
//                 a[i]=temp;
//                 j--;
//             }
//             System.out.print(a[i]+" ");
//         }
//     }
// }

import java.util.Scanner;

public class Reverse_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[i]<a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;   
                }
            }
            System.out.print(a[i]+" ");
        }
    }
}