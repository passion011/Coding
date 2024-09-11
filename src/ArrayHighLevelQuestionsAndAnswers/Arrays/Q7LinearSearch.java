package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q7LinearSearch {
    public static void main(String[] args) {
        int a[]={1,5,6,9,3,8};
        int target=8;
        for (int i=0;i<a.length;i++){
            if (a[i]==target){
                System.out.println(i);
                return;
            }
        }
    }
}
