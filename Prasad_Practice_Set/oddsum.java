// import java.util.Scanner;

// public class oddsum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the array size:");
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         System.out.println("enter the array elements:");
//         for(int i=0;i<=a.length-1;i++){
//             a[i]=sc.nextInt();
//         }
//         int sum=0;
//         System.out.println("the odd no.s are:");
//         for(int i=0;i<=a.length-1;i++){
//             if(a[i]%2 != 0){
//                 System.out.println(a[i]+" ");
//                 sum = sum+a[i];
//             }
//         }
//         System.out.println("the sum is:"+sum);
//     }
    
// }


import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int x;
        System.out.println("enter the search element:");
        x=sc.nextInt();
        for(int i=0;i<=a.length-1;i++){
            if(a[i] == x){
                System.out.println("present");
            }
        }
    }
    
}
