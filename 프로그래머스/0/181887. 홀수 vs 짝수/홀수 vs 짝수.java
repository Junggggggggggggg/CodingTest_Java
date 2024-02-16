class Solution {
    public int solution(int[] num_list) {
        int evenNum = 0;
        int oddNum = 0;
        
        for( int i=0; i< num_list.length;i++) {
            
            if(i % 2 == 0 ) { //짝수
                
                evenNum += num_list[i];   
                
            }else{ //홀수
                
                oddNum += num_list[i];
            }
        }
        return (evenNum < oddNum) ? oddNum : evenNum;
    }
}