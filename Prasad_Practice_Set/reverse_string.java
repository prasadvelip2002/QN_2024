public class reverse_string {
    public static void main(String[] args) {
        String orig = "Hello World";
        String rev = "";

        for(int i=orig.length()-1;i>=0;i--){
            rev+=orig.charAt(i);
        }
        System.out.print("rev string is:"+rev);
    }
}
