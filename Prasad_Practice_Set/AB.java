import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The line by line sorted elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println("The final sorted elementts are:");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("The smallest and largest element of xth element are:");
        int x;
        x=sc.nextInt();
        System.out.println(+x+"smallest nth element is"+arr[x-1]);
        System.out.println(+x+"largest nth element is:"+arr[arr.length-x]);
    }
}
