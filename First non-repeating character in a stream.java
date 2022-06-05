Given an input stream of A of n characters consisting only of lower case alphabets. 
The task is to find the first non repeating character, 
each time a character is inserted to the stream. If there is no such character then append '#' to the answer.
  
Ans :
 class Solution {
    public String FirstNonRepeating(String A) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            char cur = A.charAt(i);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            res.append(getNonRep(map));
        }
        return res.toString();
    }
    private char getNonRep(LinkedHashMap<Character, Integer> map){
        for(var it : map.keySet())
            if(map.get(it) == 1) return it;
        return '#';
    }
}
