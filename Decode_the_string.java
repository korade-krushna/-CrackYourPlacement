Q : An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows
original string: abbbababbbababbbab 
encoded string : 3[a3[b]1[ab]]

Ans :
class Solution {
    public String decodeString(String s) {
        LinkedList<Integer> reps = new LinkedList<>();
        LinkedList<StringBuilder> lines = new LinkedList<>();
        lines.push(new StringBuilder());
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int start = i;
                while (Character.isDigit(s.charAt(i + 1))) i++;
                reps.push(Integer.parseInt(s.substring(start, i + 1)));
            } else if(s.charAt(i) == '['){
                lines.push(new StringBuilder());
            } else if (s.charAt(i) == ']'){
                int count = reps.poll();
                String cur = lines.pop().toString();
                StringBuilder sb = new StringBuilder();
                while (count-- > 0) sb.append(cur);
                lines.push(lines.pop().append(sb));
            } else lines.push(lines.pop().append(c));
        }
        return lines.pop().toString();
    }
}
