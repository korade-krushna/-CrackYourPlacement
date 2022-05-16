Q.  Given an array of positive integers nums and a positive integer target, 
    return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. 
    If there is no such subarray, return 0 instead.
Ans : 
  
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, res = Integer.MAX_VALUE;
        int start = 0, end = 0, cnt = 0;
        while(end < n){
            while(end < n && cnt < target) cnt += nums[end++];
            while(cnt >= target){
                int len = end - start;
                res = Math.min(res, len);
                cnt -= nums[start++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
