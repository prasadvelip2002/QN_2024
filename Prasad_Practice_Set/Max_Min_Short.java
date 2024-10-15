public class Max_Min_Short {
    public static void main(String[] args) {
        int a[] = {5,3,4,8,2,1};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<=a.length-1;i++){
            if(max<a[i]){
                max=a[i];
            }else if(min>a[i]){
                min=a[i]; 
            }
        }
        System.out.println("the max is:"+max);
        System.out.println("the min is:"+min);
    }
    
}
