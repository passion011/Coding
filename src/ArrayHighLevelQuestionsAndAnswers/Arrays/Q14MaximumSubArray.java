package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q14MaximumSubArray {
//    public static void main(String[] args) {
//        int a[]={-2,-3,4,-1,-2,1,5,-3};
//        int target=7;
//        Fun(a,target);
//    }
//    static int max=0;
//    public static void Fun(int a[],int target){
//        for (int i=0;i<a.length;i++){
//            for (int j=i;j<a.length;j++){
//                int sum=0;
//                int count=0;
//                for (int k=i;k<j;k++){
//                    sum+=a[k];
//                    count=count+1;
//                }
//                if (sum==target){
//                    if (sum>max){
//                        System.out.println(i);
//                        System.out.println(j);
//                        System.out.println("Over");
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Fun(a);
    }

    public static void Fun(int a[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + max);
    }

}
