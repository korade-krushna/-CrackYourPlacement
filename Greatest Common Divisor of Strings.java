class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int n = str1.length(), m = str2.length();
        int str_gcd = gcd(n, m);
        return str1.substring(0, str_gcd);
    }
    private int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
