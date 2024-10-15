import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x;
        int count=0;
        System.out.println("Enter the element for search:");
        x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.print(count+" ");
    }
}