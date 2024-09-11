package Arrays;

import java.util.ArrayList;

public class TwoSumProblem {
    public static void main(String[] args) {
        int a[]={2,6,5,8,11};
        int target=14;
        Fun(a,target);
    }
    public static void Fun(int a[],int target){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                int sum=a[i]+a[j];
                if (sum==target){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    System.out.println(list);

                }
            }
        }
    }
}

