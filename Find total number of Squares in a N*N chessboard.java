Q : Find total number of Squares in a N*N cheesboard.
Ans : 
    class Solution {
    static Long squaresInChessBoard(Long n) {
        return (long) n*(n + 1)*(2*n + 1)/6;
    }
}
