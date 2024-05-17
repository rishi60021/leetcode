class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0]=-1;
        result[1]=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]==target){
                result[0]=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]==target){
                result[1]=mid;
                low=mid+1;
            }
            else{
                
                low=mid+1;
            }
        }

        return result;
    }
}