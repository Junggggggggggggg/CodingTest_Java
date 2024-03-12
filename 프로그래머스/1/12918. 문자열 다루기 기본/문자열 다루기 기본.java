class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int len = s.length();
        
        if( len!=4 && len!=6) {            
            answer = false;            
        }
        
        if(answer) {
            
            for( int i=0; i<len; i++) {
                if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    return false;
                }
            }
            
        }
                
        return answer;
    }
}