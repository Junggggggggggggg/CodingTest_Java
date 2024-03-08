class Solution {
    public int solution(int[] numbers) {
        int answer = 0;       
        
        for( int i=1; i<10; i++) {
            
            int count = 0;
            
            for( int j=0; j<numbers.length; j++) {
                
                if(i==numbers[j]) {
                    break;
                }else {
                    ++count;
                }
                
                if( numbers.length == count) {
                    answer += i;
                }
                
            }
            
        }
        
        return answer;
    }
}