public class pat {
    public static void main(String[] args) {
        int i,j,count=0;
        for(i=1;i<=5;i++){
            count=i;
            for(j=1;j<=5;j++){
                System.out.print(count+" ");
                count+=5;
            }
            System.out.println();
        }
    }
}
