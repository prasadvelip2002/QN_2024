import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elemnets:");
        for(int i=0;i<=a.length-1;i++){
            a[i] = sc. nextInt();
        }
        int count=0;
        for(int i=0;i<=a.length-1;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        if(count==a.length){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }

    }
    
}
