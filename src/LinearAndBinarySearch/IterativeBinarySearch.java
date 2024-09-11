package LinearAndBinarySearch;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 5, 10, 20, 56, 89, 74};
        int target = 899;
        int low = 0;
        int high = a.length - 1;
        find(a, target, low, high);
    }

    public static void find(int a[], int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                System.out.println("Item is found at index: " + mid);
                return;
            } else if (a[mid] < target) {
                low = mid + 1;
                find(a, target, low, high);
            } else {
                high = mid - 1;
                find(a, target, low, high);
            }
        } else {
            System.out.println("Item not found in the array.");
        }
    }
}
