public class recursion_method {
    public static void main(String[] args) {
        print1(1);
    }
    static void print1(int n){
        System.out.println("Hello world!");
        print2(n);
    }
    static void print2(int n){
        System.out.println("Hello world!");
        print3(n);
    }
    static void print3(int n){
        System.out.println("Hello world!");
        print4(n);
    }
    static void print4(int n){
        System.out.println("Hello world!");
        print5(n);
    }
    static void print5(int n){
        System.out.println("Hello world!");
    }
}
