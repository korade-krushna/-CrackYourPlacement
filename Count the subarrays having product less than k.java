Q : Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.
Ans : 
    class Solution {
    public int countSubArrayProductLessThanK(long a[], long n, long k){
        int start = 0, end = 0, res = 0;
        long cnt = 1;
        while(end < n){
            cnt *= a[end];
            while(cnt >= k) cnt /= a[start++];
            int slide = end - start + 1;
            res += slide;
            end++;
        }
        return res;
    }
}
