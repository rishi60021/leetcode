import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int longest=1;
        int currcount=0;
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==smallest){
                currcount++;
                smallest=nums[i];
            }
            else if(nums[i]!=smallest){
                currcount=1;
                smallest=nums[i];
            }
            longest=Math.max(longest,currcount);
        }

        return longest;
    }
}