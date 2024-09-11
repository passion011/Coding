package ArrayHighLevelQuestionsAndAnswers.Arrays;

import java.util.Arrays;

public class Q5RotateArrayKplaces {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int d=3;
        int z=0;
        if (d>a.length){
            int val=d%a.length;
            d=val;
        }
        int temp[]=new int[d];
        for (int i=0;i<temp.length;i++){
         temp[i]=a[i];
        }
        for (int j=d;j<a.length;j++){
            a[j-d]=a[j];
        }
        for (int k=d+1;k<a.length;k++){
            a[k]=temp[z];
            z++;
        }

        System.out.println(Arrays.toString(a));
    }
}
