import java.util.Scanner;

public class Armstrong {
    int r,sum=0,m=n,count=0;
    boolean isArmstrong(int n){
        while(n!=0){
            r=n%10;
            n=n/10;
        }
    }
    
}

public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,end,i;
        System.out.println("Enter start of range:");
        start=sc.nextInt();
        System.out.println("Enter end of range:");
        end=sc.nextInt();
        System.out.println("The armstrong number in given range are:");
        Armstrong a = new Armstrong();
        for(i=start;i<=end;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    
}
