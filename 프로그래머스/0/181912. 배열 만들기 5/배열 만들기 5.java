import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(String str : intStrs) {
            StringBuilder sb = new StringBuilder();
            for(int i=s;i<s+l; i++) sb.append(str.charAt(i));
                
            str = sb.toString();
            int num = Integer.parseInt(str);
            if(num > k) result.add(num);
        }
        
        int[] answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}