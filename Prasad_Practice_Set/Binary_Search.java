public class Binary_Search {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int target=4;
        int ans=binarysearch(a, target);
        System.out.println(ans);
    }
    static int binarysearch(int[] a,int target){
        int start=0;
        int end=a.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<a[mid]){
                end=mid-1;
            }else if(target>a[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
