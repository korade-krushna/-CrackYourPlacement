class Solution {
    public boolean isValidSudoku(char[][] b) {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = b[i][j];
                if(num != '.'){
                   if(!set.add(num + "in row" + i) || 
                      !set.add(num + "in col" + j) || 
                      !set.add(num + "in block" + i/3 + "-" + j/3)) return false;

                }
            }
        }
        System.out.println(set);
        return true;
    }
}
