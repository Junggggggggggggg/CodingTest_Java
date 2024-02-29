class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int number = 1;
        int x = 0;
        int y = 0;
        int direction = 0;
        
       while(number <= n*n) {
            answer[x][y] = number++;
            
            if( direction == 0) {
                if( y == n-1 || answer[x][y+1] != 0) {
                    direction = 1;
                    x++;
                } else {
                    y++;
                }
            } else if( direction == 1) {
                if( x == n-1 || answer[x+1][y] != 0) {
                    direction = 2;
                    y--;
                } else {
                    x++;
                }
            } else if( direction == 2) {
                if( y == 0 || answer[x][y-1] != 0) {
                    direction = 3;
                    x--;
                } else {
                    y--;
                }
            } else if( direction == 3) {
                if( x == 0 || answer[x-1][y] != 0) {
                    direction = 0;
                    y++;
                } else {
                    x--;
                }
            }
        }
        
        return answer;
    }
}