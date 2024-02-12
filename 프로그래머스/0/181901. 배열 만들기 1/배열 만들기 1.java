import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=1; k*i<=n; i++) {
            
            answer.add(k*i);
        
        }
        
        return answer;
    }
}