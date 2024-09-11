package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q17LongestConsecutiveSequence {
    public static void main(String[] args) {
        int a[]={102,4,100,1,101,3,2,1,1};
        int count=0;
        int max=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                int target=a[i]+1;
                if (a[j]==target){
                    count=count+1;
                    target=target+1;
                }
            }
        }
    }
}
