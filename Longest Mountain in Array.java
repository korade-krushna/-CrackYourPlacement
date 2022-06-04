Q : You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
  
  ANS :
 class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length - 1;
        int res = 0, indx = 0;
        while(indx < n){
            int incr = 0, decr = 0;
            while(indx < n && arr[indx + 1] > arr[indx]) { indx++; incr++; }
            while(indx < n && arr[indx + 1] < arr[indx]) { indx++; decr++; }
            if(indx <= n && incr > 0 && decr > 0) res = Math.max(res, incr + decr + 1);
            while(indx < n && arr[indx + 1] == arr[indx]) indx++;
        }
        return res;
    }
}
