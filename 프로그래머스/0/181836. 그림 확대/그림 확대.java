import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        ArrayList<String> list = new ArrayList<>();
        
        for( int i=0; i<picture.length; i++) {
            
            String[] large = picture[i].split("");
            
            String str = "";
            
            for( int j=0; j < large.length; j++) {
                str += large[j].repeat(k);
            }
            
            for( int j=0; j<k; j++) {
                list.add(str);
            }
            
        }
        
        return list.toArray(new String[list.size()]);
    }
}