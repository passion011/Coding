package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArrayWithOutChange {
    public static void main(String[] args) {
        int a[]={1,2,4,5,3,6};
        int i=0;
        int j=a.length-1;
        reverse(a,i,j);
    }
    public static void reverse(int a[],int i,int j){
        if (i>j){
            System.out.println(Arrays.toString(a));
            return;
        }
        if (i==j){
            System.out.println(Arrays.toString(a));
            return;
        }
        else {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            reverse(a, ++i, --j);
        }
    }
}
