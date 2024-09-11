package ArrayHighLevelQuestionsAndAnswers.Arrays;

import java.util.Arrays;

public class Q4RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3};
        int i=0;
        int j=1;
        int k=1;
        Fun(a,i,j,k);
    }
    public static void Fun(int a[],int i,int j,int k){
        if (j==a.length-1){
            System.out.println(Arrays.toString(a));
            return;
        }
        if (a[i]!=a[j]){
            a[k]=a[j];
            Fun(a, ++i, ++j,++k);
        }
        else {
            Fun(a, ++i, ++j,k);
        }
    }
}
