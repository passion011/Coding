package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q2SecondLargest {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 7, 7, 5};
        int largest = a[0];
        int secondLargest = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + (secondLargest != -1 ? secondLargest : "No second largest"));
    }
}
