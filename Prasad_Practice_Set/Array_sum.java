

// public class Array_sum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elemnts:");
//         for(int i=0;i<=arr.length-1;i++){
//             arr[i] = sc.nextInt(); 
//         }
//         int sum=0;
//         for(int i=0;i<=arr.length-1;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }



// import java.util.Scanner;
// class Solution {
//     int sum(int arr[]) {
//         // code here
//         int sum=0;
//         for(int i=0;i<=arr.length-1;i++){
//             sum=sum+arr[i];
//         }
//         return sum;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of the array:");
//         int n = sc.nextInt();
//         Solution sol = new Solution();
//         int arr[] = new int[n];
//         System.out.println("Enter the array elemnts:");
//         for(int i=0;i<=arr.length-1;i++){
//             arr[i] = sc.nextInt(); 
//         }
//         int ans = sol.sum(arr);
//         System.out.println(ans);
       
//     }
// }

// class Solution {
//     int sum(int arr[]) {
//         // code here
//         int sum=0;
//         for(int i=0;i<=arr.length-1;i++){
//             sum=sum+arr[i];
//         }
//         return sum;
        
//     }
//     public static void main(String[] args) {
//     int arr[] = {1,2,3,4};
//     System.out.println(arr);
//     }
// }


class Solution
{
    public static String is_palindrome(int n)
    {
        // Code here
        int x=0;
        int m=n;
        int r;
        while(n!=0){
            r=n%10;
            x=(x*10)+r;
            n=n/10;
        }
        if(m==x){
            return "Yes";
        }else{
            return "No";
        }
    }
    public static void main(String args[]){
        int n=555;
        String ans = is_palindrome(n);
        System.out.println(ans);
    }
}





