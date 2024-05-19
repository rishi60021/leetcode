class Solution {
    public static int Maxm(int[] nums){
     int maxm=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        maxm=Math.max(nums[i],maxm);
     }
     return maxm;

    }
    public static int Sum(int[] nums, int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)(nums[i])/(double)(mid));
           
        }
 return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       
        int low=1;
        int high= Maxm(nums);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(Sum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}