import java.util.Scanner;

public class AB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc. nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc. nextInt();
        }

        for(int i=1;i<=arr.length-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    
}