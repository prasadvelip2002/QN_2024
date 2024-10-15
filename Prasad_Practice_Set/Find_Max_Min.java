import java.util.Scanner;

public class Find_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] a = new int[n];
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
            System.out.println(a[i]+" ");
        }
        int min=a[0];
        int max=a[a.length-1];
        System.out.println("the min is:"+min);
        System.out.println("the max is:"+max);
    }   
}
