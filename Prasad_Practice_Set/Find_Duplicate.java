import java.util.Scanner;

public class Find_Duplicate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-2;j++){
                if(a[i]==a[j+1]){
                    count++;
                    System.out.println(a[i]+" ");
                }
            }
        }
    }
}