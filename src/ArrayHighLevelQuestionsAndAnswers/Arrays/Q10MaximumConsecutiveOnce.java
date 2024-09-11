package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q10MaximumConsecutiveOnce {
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1,0,1,1};
        int i=0;
        int count=1;
        Fun(a,i,count);
    }
    static int max=0;
    public static void Fun(int a[],int i,int count){
        if (i==a.length-1){
            System.out.println(max);
            return;
        }
        if (a[i]==a[i+1]){
            count=count+1;
            Fun(a, ++i,count);
        }
        else {
            if (count>max){
                max=count;
            }
            Fun(a, ++i,count=1);
        }
    }
}
