class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        
        int answer = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)-'0'==k){
                answer = i+1;
                break;
            }else{
                answer = -1;
            }
        }
       
        return answer;
    }
}