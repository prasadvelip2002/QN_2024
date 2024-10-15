// public class pattern {
//     public static void main(String[] args) {
//         int i,j,count=1;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
    
// }


// public class pattern {
//     public static void main(String[] args) {
//         int i,j;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=6-i;j++){
//                 System.out.print((char) (64+j) +" ");
//             }
//             System.out.println();
//         }
//     }
    
// }


// public class pattern {
//     public static void main(String[] args) {
//         int i,j,count=1;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 if(i%2==0){
//                     System.out.print(j+" ");
//                 }else{
//                     System.out.print((char) (64+j)+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }



// public class pattern {
//     public static void main(String[] args) {
//         int i,j,count=1;
//         for(i=1;i<=5;i++){
//             for(j=1;j<=i;j++){
//                 if(count%2!=0){
//                     System.out.print((char) (64+count)+" ");
//                 }else{
//                     System.out.print((char) (96+count)+" ");
//                 }
//                 count++;
//             }
//             System.out.println();
//         }
//     }
    
// }

public class pattern {
    public static void main(String[] args) {
        int i,j,count=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if(count%2!=0){
                    System.out.print(count+" ");
                }else if(count%4==0){
                    System.out.print((char) (64+count)+" ");
                }else{
                    System.out.print((char) (96+count)+" ");
                }
                count++;
            }
            System.out.println();
        }
    }
    
}
