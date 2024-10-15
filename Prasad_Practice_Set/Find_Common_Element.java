public class Find_Common_Element {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {2,4,6,8,9};
        int count=0;
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=b.length-1;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
    
}
