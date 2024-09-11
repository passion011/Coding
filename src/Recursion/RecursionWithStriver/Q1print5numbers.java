package Recursion.RecursionWithStriver;

public class Q1print5numbers {
    public static void main(String[] args) {
        int n=1;
        Fun(n);
    }
    public static void Fun(int n){
        if (n>=5){
            return;
        }
        System.out.println(n);
        Fun(++n);
    }
}
