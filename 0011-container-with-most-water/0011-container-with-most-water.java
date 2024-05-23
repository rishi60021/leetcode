class Solution {
    public int maxArea(int[] height) {
       int left =0;
       int right=height.length-1;
       int water=Integer.MIN_VALUE;
       while(left<right){
        int currentheight=Math.min(height[left],height[right]);
        int waterarea=currentheight*(right-left);
        water=Math.max(waterarea,water);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }

       }
        return water;
    }
}