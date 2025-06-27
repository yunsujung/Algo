class Solution {
    public int solution(int i, int j, int k) {
        /* 
        i부터j까지 for문 돌려서 숫자를 문자로 변환해서 스트링에 넣기.
        그리고 char? 로 k 비교해서 있으면 answer++하기.
        */
        int answer = 0;
        String str = "";
        for(int start=i; start<=j; start++){
            str += Integer.toString(start);
        }
        
        for(int idx=0; idx<str.length(); idx++){
            if((char)(k+'0')==str.charAt(idx)){
                answer++;
            }
        }
        return answer;
    }
}