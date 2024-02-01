class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String A = String.valueOf(a);
        String B = String.valueOf(b); 
        
        String AB = ""+A+B;
        String BA = ""+B+A;
        
        int AB1 = Integer.valueOf(AB);
        int BA1 = Integer.valueOf(BA);
        
        if(AB1>BA1) {
            answer = AB1;
        }else{
            answer = BA1;
        }
        
        return answer;
    }
}