package LeetCode;

import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        int stones[]={2,7,4,1,8,1};
        lastStoneWeight(stones);
    }
    public static int lastStoneWeight(int[] stones) {
        int max=0;
        int secondmax=0;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > max) {
                secondmax = max; // Update secondMax to previous max
                max = stones[i]; // Update max to the new maximum
            } else if (stones[i] > secondmax) {
                secondmax = stones[i]; // Update secondMax if the current element is greater than the previous secondMax
            }
        }
        int val=max-secondmax;
        

        return 0;
    }
}

