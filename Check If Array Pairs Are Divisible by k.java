 Q . Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.
  
  Ans : 
    class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k];
        for(int it : arr){
            it %= k;
            if(it < 0) it += k;
            freq[it]++;
            
        }
        if(freq[0]%2 != 0) return false;
        for(int i = 1; i <= k/2; i++){
            if(freq[i] != freq[k - i])
                return false;
        }
        return true;
    }
}
