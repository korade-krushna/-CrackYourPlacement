Q : Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of 
    their appearance in the original array. Look at the sample case for clarification.
Ans :
class Solution {
    public List<List<String>> Anagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new TreeMap<>();
        for(var it : strs){
            char[] f_sort = it.toCharArray();
            Arrays.sort(f_sort);
            String key = new String(f_sort);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(it);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
