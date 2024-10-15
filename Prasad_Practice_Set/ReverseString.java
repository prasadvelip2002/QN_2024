// public class ReverseString {
//     public static void main(String[] args) {
//         String original = "Hello world";
//         String reverse = "";

//         for(int i=original.length()-1;i>=0;i--){
//             reverse+=original.charAt(i);
//         } 
//         System.out.println("original String is: "+original);
//         System.out.println("reversed String is: "+reverse);
//     }
// }

// public class ReverseString {
//     public static void main(String[] args) {
//         String original = "Hello world";
//         String reverse = "";

//         String words[] = original.split(" ");

//         for(int i=words.length-1;i>=0;i--){
//             reverse+=words[i] + " ";
//         } 

//         reverse = reverse.trim();

//         System.out.println("original String is: "+original);
//         System.out.println("reversed String is: "+reverse);
//     }
// }


class ReverseString{
    public static void main(String[] args) {
        String orig = "Hello World";
        String rev = "";

        String words[] = orig.split(" ");

        for(int i=words.length-1;i>=0;i--){
            rev+=words[i]+" ";
        }
        rev = rev.trim();

        System.out.println("Original string is:"+orig);
        System.out.println("reverse string is:"+rev);
    }
}