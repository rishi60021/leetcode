class Solution {
    public int maxProduct(int[] nums) {
        int maxm = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int pdt = 1;
            for (int j = i; j < nums.length; j++) {
                    pdt = pdt * nums[j];
                    maxm = Math.max(pdt, maxm);
                

            }
        }
        return maxm;

    }
}