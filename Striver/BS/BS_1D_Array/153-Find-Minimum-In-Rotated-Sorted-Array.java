//brute force: find the no. of rotation in rotated sorted array and return the nums[k]
//optimise: find the sorted half by 
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        if(nums[low]<= nums[high]){
            ans = nums[low];
        }
        while(low<= high){
            int mid = low+ (high-low)/2;
            
            if(nums[mid] <= nums[high]){
                 high = mid-1;
            }else{
                low =mid+1;
            }
        }
        return ans= nums[low];
    }   
}