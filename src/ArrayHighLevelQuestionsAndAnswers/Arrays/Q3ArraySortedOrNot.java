package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q3ArraySortedOrNot {
    public static void main(String[] args) {
        int a[]={1,2,3,4,7,5};
        for (int i=0;i< a.length-1;i++){
            if (a[i]<a[i+1]){
                continue;
            }
            else {
                System.out.println("Array is not sorted");
                break;
            }
        }
        System.out.println("Array is sorted");
    }
}
