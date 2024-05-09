class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int first_neg=1;
        int first_pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[first_pos]=nums[i];
                first_pos+=2;
            }
            else{
                ans[first_neg]=nums[i];
                first_neg+=2;
            }
        }
        return ans;
        
        
    }
}