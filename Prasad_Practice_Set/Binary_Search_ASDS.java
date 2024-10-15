public class Binary_Search_ASDS {
    public static void main(String[] args) {
        int[] a = {23,12,8,7,6,5,4};
        int target=5;
        int ans=orderagnostic(a, target);
        System.out.println(ans);
    }
    static int orderagnostic(int[] a, int target){
        int start=0;
        int end=a.length-1;

        boolean isAsc = a[start]<a[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==a[mid]){
                return mid;
            }
            if(isAsc){
                if(target<a[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>a[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
