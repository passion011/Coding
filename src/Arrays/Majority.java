package Arrays;

public class Majority {
    public static void main(String[] args) {
        int a[]={2,2,3,3,1,2,2};
        int i=0;
        int j=0;
        Fun(a,i,j);
    }
    static int count=0;
    public static void Fun(int a[],int i,int j){
        if (j==a.length){
            int check=count;
        }
        if (a[i]==a[j]){
            count=count+1;
            Fun(a, i, ++j);
        }

    }
}
