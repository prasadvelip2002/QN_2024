import java.util.Scanner;

public class AB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        System.out.println("The odd no.are:");
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
                sum+=arr[i];
            }
        }
        System.out.println();
        System.out.println("The sum of odd numbers is :"+sum);
    }
}