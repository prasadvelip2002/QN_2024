import java.util.Scanner;

public class arraybalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        // System.out.println("enter the mid element:");
        // int mid = sc.nextInt();
        int start=0,end=a.length-1;
        int mid=start+(end-start)/2;
        int suma=0;
        for(int i=0;i<mid;i++){
            suma=suma+a[i];
        }
        System.out.println("the suma is:");
        System.out.println(suma);
        int sumb=0;
        for(int i=mid+1;i<=a.length-1;i++){
            sumb=sumb+a[i];
        }
        System.out.println("the sumb is:");
        System.out.println(sumb);
        System.out.println();
        if(suma==sumb){
            System.out.println("The array is balanced");
        }else{
            System.out.println("The array is not balanced");
        }
    }
    
}
