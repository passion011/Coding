package Arrays;

import java.util.ArrayList;

public class basicArrayProgram {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,1,1,4,2,3};
       Fun(a);
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void Fun(int a[]){
        for (int i=0;i< a.length;i++){
            for (int j=i;j<a.length;i++){
                list.add(a[i]);
                list.add(a[j]);
                System.out.println(list);
            }
        }
    }
}
