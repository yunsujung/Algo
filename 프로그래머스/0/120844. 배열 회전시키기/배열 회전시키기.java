class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        int rIdx = 0;
        int lIdx = numbers.length-1;
        
        for(int i=0; i<numbers.length; i++){
            if(direction.equals("right")){
                if(i==0){
                    answer[i]=numbers[lIdx];
                }else{
                    answer[i]=numbers[i-1];
                }
            }else if(direction.equals("left")){
                if(i==numbers.length-1){
                    answer[numbers.length-1]=numbers[rIdx];
                }else{
                    answer[i]=numbers[i+1];
                }
            }
        }
        
        
        return answer;
    }
}