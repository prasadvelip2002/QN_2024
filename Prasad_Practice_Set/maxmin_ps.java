import java.util.Scanner;

public class maxmin_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a.length-2;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=sum+a[i];
        }
        System.out.println("the sum is:"+sum);
        System.out.println();
        int max_Sum=sum-a[0];
        int min_sum=sum-a[a.length-1];
        System.out.println("the max sum is:"+max_Sum);
        System.out.println("the min sum is:"+min_sum);
    }
    
}
