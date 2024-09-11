package Recursion;

public class sumoffirstnnumber {
    public static void main(String[] args) {
        int n=3;
        int sum=0;
        fun(n,sum);
    }
    public static void fun(int n,int sum){
       for(int i=0;i<=n;i++){
           sum=sum+i;
       }
        System.out.println(sum);

    }
}
