Due to the rise of covid-19 cases in India, this year BCCI decided to organize knock-out matches in IPL rather than a league.

Today is matchday 2 and it is between the most loved team Chennai Super Kings and the most underrated team - Punjab Kings. Stephen Fleming, the head coach of CSK,
analyzing the batting stats of Punjab. He has stats of runs scored by all N players in the previous season and he wants to find the maximum score 
for each and every contiguous sub-list of size K to strategize for the game.
Ans -
  class Solution {
    static ArrayList<Integer> max_of_subarrays(int nums[], int n, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            while(!q.isEmpty() && q.peek() < i - k + 1) q.poll();
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()]) q.pollLast();
            q.offer(i);
            if(i >= k - 1) res.add(nums[q.peekFirst()]);
        }
        return res;
    }
}
