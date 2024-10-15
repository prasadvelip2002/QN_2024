import java.util.Scanner;

public class missingno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        n=arr.length+1;

        int expected_sum = n*(n+1)/2;
        
        int actual_sum=0;
        for(int ele:arr){
            actual_sum+=ele;
        }

        int missingno = expected_sum-actual_sum;
        System.out.println(missingno);
    }
}
