class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd = "";
        String even = "";
        
        for(int i=0; i< num_list.length;i++) {
            
            if (num_list[i] % 2 == 0) { //짝수일때
                even += Integer.toString(num_list[i]);
            }else{ //홀수일때
                odd += Integer.toString(num_list[i]);
            }
            
        }
        
            int evensum = Integer.parseInt(even);
            int oddsum = Integer.parseInt(odd);
        
            return evensum+oddsum;
        
           
    }
}