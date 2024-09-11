package Arrays;
class Solution {
    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        singleNumber(nums);
    }
    public static void singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]!=nums[j]){
                    System.out.println(nums[i]);
                    break;
                }
            }
        }

    }
}
