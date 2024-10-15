import java.util.Scanner;

public class marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements:");
        int marks=sc.nextInt();
        if(marks>95){
            System.out.println("Distinction");
        }else if(marks>60){
            System.out.println("first class");
        }else if(marks>40){
            System.out.println("pass");
        }else if(marks>35 && marks<40){
            System.out.println("pick the chit:");
            int chit = sc.nextInt();
            marks = chit+marks;
            System.out.println("The added marks:"+marks);
            if(marks>40){
                System.out.println("A");
            }else{
                System.out.println("Fail");
            }
        }else{
            System.out.println("Fail");
        }
    }
    
}
