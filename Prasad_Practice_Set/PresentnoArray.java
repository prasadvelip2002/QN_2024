import java.util.Scanner;

public class PresentnoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the search element:");
        int x=sc.nextInt();
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==x){
              System.out.println("the element is present");
        }
    } 
    }
}
