Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.
  Ans :
 class Solution {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            while(!q.isEmpty() && q.peek() <= i - k) q.poll();
            while(!q.isEmpty() && arr[q.peekLast()] < arr[i]) q.pollLast();
            q.offer(i);
            if(i >= k - 1) res.add(arr[q.peek()]);
        }
        return res;
    }
}
