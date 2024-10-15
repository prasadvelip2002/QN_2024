class odd {
    static String oddEven(int n) {
        // code here
        if(n%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
    public static void main(String[] args){
        int n=4;
        String ans = oddEven(n);
        System.out.println(ans);
    }
}