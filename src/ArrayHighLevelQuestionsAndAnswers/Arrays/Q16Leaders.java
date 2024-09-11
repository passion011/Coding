package ArrayHighLevelQuestionsAndAnswers.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q16Leaders {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int max = Integer.MIN_VALUE;
        Set<Integer> list=new HashSet<>();
        for (int i= arr.length-1;i>=0;i--){
            if (arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
