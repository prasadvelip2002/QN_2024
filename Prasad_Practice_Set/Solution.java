// class Solution
// {
//     public static void main(String[] args){
//         int n=10;
//         Solution sol = new Solution();
//         sol.printNos(n);
//     }
//   public void printNos(int N)
//     {
//         //Your code here
//         if(N<=0){
//             return;
//         }
//         printNos(N-1);
//         System.out.print(N+" ");
//     }
// }



/*Complete the Function below*/
class Solution {
    public static void main(String[] args){
        int arr[] = {111,222,333,444,555};
        Solution sol = new Solution();
        sol.palinArray(arr);
        
    }
    public static boolean palinArray(int[] arr) {
        // add code here.
        int x=0;
        int r;
        int i;
        int m=arr[i];
        for(i=0;i<=arr.length-1;i++){
            while(arr[i]!=0){
                r=arr[i]%10;
                x=(x*10)+r;
                arr[i]=arr[i]/10;
            }
        }
        if(m==x){
            return true;
        }else{
            return false;
        }
}
}
