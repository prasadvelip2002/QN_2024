import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of classes:");
        int r = sc.nextInt();
        System.out.println("enter the number of students in each class:");
        int c=sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<=r-1;i++){
            System.out.println("enter the marks of the student of class "+(i+1)+" : ");
            for(int j=0;j<=c-1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("marks of students are:");
        for(int i=0;i<=r-1;i++){
            System.out.println("class "+(i+1)+" : ");
            for(int j=0;j<=c-1;j++){ 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
