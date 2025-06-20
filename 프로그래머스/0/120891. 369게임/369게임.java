class Solution {
    public int solution(int order) {
        /**
        일단 숫자를 문자로 바꾸고. 문자를 char로 변환해서
        3,6,9 가 들어가면 하나씩 늘어나게!!
        **/
        String orderStr = String.valueOf(order);
        
        int answer = 0;
        
        for(int i=0; i<orderStr.length(); i++){
            char idx = orderStr.charAt(i);
            if(idx=='3'){
                answer++;
            }else if(idx=='6'){
                answer++;
            }else if(idx=='9'){
                answer++;
            }
                
        }
        return answer;
    }
}