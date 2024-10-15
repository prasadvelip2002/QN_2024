import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the marks of the students:");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("the marks of student "+(i+1)+" = "+arr[i]);
            }
    }
}

