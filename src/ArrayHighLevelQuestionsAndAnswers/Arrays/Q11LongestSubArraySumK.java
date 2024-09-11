package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q11LongestSubArraySumK {
    public static void main(String[] args) {
        int a[] = {10, 15, -5, -10, 5};
        findLongestSubarray(a);
    }

    static int target = 10;

    public static void findLongestSubarray(int a[]) {
        int start = -1, end = -1;
        int maxLength = 0;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];

                if (sum == target && (j - i + 1) > maxLength) {
                    start = i;
                    end = j;
                    maxLength = j - i + 1;
                }
            }
        }

        if (start != -1 && end != -1) {
            System.out.println("Longest Subarray with Sum " + target + ":");
            System.out.println("Start Index: " + start);
            System.out.println("End Index: " + end);
        } else {
            System.out.println("No subarray found with sum " + target);
        }
    }
}
