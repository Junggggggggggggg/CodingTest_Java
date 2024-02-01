class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String AB = Integer.toString(a)+Integer.toString(b);
        
        int AB1 = Integer.valueOf(AB);
        
        if(AB1 > a*b*2) {
            answer = AB1;
        }else{
            answer = a*b*2;
        }
        
        return answer;
    }
}