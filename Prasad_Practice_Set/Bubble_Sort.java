
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;   
                }
            }
            System.out.println("the line by line sorted array elements are:");
            for(int k=0;k<a.length-1-i;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
        System.out.println("the final sorted arraay elemrnts are:");
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int x;
        System.out.println("enter the search element:");
        x=sc.nextInt();
        System.out.println("the "+x+" smallest element is:"+a[x-1]);
        System.out.println("the "+x+" largest element is:"+a[a.length-x]);
    }
}