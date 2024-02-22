import java.util.*;

class Solution {
    public ArrayList solution(String myStr) {
        
        ArrayList<String> result = new ArrayList<>();
        String answer = "";
        
        for(int i=0;i<myStr.length();i++) {
            
            char c = myStr.charAt(i);
            
            if( c == 'a' || c == 'b' || c == 'c') {
                
                if( answer != ""){
                    result.add(answer);
                    answer = "";
                }
                
            }else {
                
                answer += c;
                
            }
            
        }
        
        if(answer != "") result.add(answer);
        if(result.size() == 0) result.add("EMPTY");
        
        return result;
    }
}