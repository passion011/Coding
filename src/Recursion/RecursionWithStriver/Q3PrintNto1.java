package Recursion.RecursionWithStriver;

public class Q3PrintNto1 {
    public static void main(String[] args) {
        int n=5;
        Fun(n);
    }
    public static void Fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        Fun(--n);
    }
}
