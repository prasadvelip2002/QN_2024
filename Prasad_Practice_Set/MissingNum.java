import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={7,2,1,0,3,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
        
    }
    static int sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
            for(int index=0;index<arr.length;index++){
                if(arr[index]!=index){
                    return index;
                }
            }
            return arr.length;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }  
}
