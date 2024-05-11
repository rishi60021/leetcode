class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxm = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxm = Math.max(count, maxm);
            } else {
                count = 0;
                  maxm = Math.max(count, maxm);
            
            }
        }
        return maxm;

    }

}