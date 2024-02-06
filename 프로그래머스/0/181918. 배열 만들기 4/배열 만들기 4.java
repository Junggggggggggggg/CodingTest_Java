import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        
        while(i<arr.length) {
            if(result.size() == 0) {
                result.add(arr[i]);
                i= i+1;
            }else{
                int lastresult = result.get(result.size()-1);
                if(result.size() != 0 && lastresult < arr[i]){
                    result.add(arr[i]);
                    i= i+1;
                }else if(result.size() != 0 && lastresult >= arr[i]) {
                    result.remove(result.size()-1);
                }
            }
        }
        
        int stk[] = new int [result.size()];
        for( int j=0; j<result.size(); j++){
            stk[j] = result.get(j).intValue();
        }
        
        return stk;
    }
}