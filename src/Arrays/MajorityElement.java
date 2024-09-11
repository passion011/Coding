package Arrays;
public class MajorityElement {

    public static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a potential candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify if the candidate is a majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        if (count > nums.length / 2) {
            return candidate;
        } else {
            // If no majority element exists
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 3, 1, 2, 2};
        int majorityElement = findMajorityElement(array);

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No majority element found.");
        }
    }
}

