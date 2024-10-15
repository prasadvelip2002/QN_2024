// import java.util.Scanner;

// public class AB5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array size:");
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elements:");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++){
//                 if(arr[i] > max){
//                     max=arr[i];
//                 }
//             }
//             System.out.println(max);
//     }
// }


import java.util.Scanner;

public class AB5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
                if(arr[i] < min){
                    min=arr[i];
                }
            }
            System.out.println(min);
    }
}