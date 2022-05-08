Q : Given a pattern containing only I's and D's. I for increasing and D for decreasing.
    Devise an algorithm to print the minimum number following that pattern.
    Digits from 1-9 and digits can't repeat.
  ANS :
      class Solution{
        static String printMinNumberForPattern(String s){
            StringBuilder sb = new StringBuilder();
            Stack<Integer> st = new Stack<>();
            int cnt = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'I'){
                    st.push(cnt++);
                    while(!st.isEmpty())
                        sb.append(st.pop());
                } else 
                    st.push(cnt++);
            }
            st.push(cnt);
            while(!st.isEmpty())
                sb.append(st.pop());
            return sb.toString();
        }
  }
