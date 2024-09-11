package ArrayHighLevelQuestionsAndAnswers.Arrays;

import java.util.ArrayList;

public class Q12TwoSumProblem {
    public static void main(String[] args) {
        int a[]={2,5,6,8,11};
        int target=14;
        Fun(a,target);
    }
    public static void Fun(int a[],int target){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int sum=a[i]+a[j];
            if (sum==target){
                ArrayList list=new ArrayList();
                list.add(i);
                list.add(j);
                System.out.println(list);
                return;
            }
            if (sum<target){
                i=i+1;
            }
            else {
                j=j-1;
            }
        }
        System.out.println("Element is not found");
    }
}
