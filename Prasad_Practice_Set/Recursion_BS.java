// public class Recursion_BS {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,23,45};
//         int target = 23;
//         System.out.println(search(arr,target,0,arr.length-1));

//     }
//     static int search(int[] arr,int target,int s,int e){
//         if(s > e){
//             return -1;
//         }

//         int m=s+(e-s)/2;

//         if(arr[m]==target){
//             return m;
//         }

//         if(arr[m]<target){
//             return search(arr,target,m+1,e);
//         }
//         return search(arr,target,s,m-1);
//     }
// }



public class Recursion_BS {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,24,36};
        int n=arr.length;
        int target = 45;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return BS(arr, target, m+1, e);
        }
        return BS(arr, target, s, m-1);
    }
}

