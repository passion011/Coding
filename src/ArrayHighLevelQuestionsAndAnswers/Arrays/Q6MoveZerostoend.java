package ArrayHighLevelQuestionsAndAnswers.Arrays;

import java.util.Arrays;

public class Q6MoveZerostoend {
    public static void main(String[] args) {
        int a[]={1,0,2,3,2,0,0,4,5,1};
        int k=0;
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                a[k]=a[i];
                k=k+1;
            }
            else {
                count=count+1;
            }
        }
        for (int j=a.length-count;j<a.length;j++){
            a[j]=0;
        }
        System.out.println(Arrays.toString(a));
    }
}
