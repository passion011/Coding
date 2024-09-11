package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q13Sort012 {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        sort012(a);

        // Print the sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void sort012(int a[]) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
