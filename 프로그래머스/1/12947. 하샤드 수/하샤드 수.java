class Solution {
    public boolean solution(int x) {
        int digits = String.valueOf(x).length();
        String s = String.valueOf(x);
        int sum = 0;
        for(int i=0; i<digits; i++){
            char c = s.charAt(i);
            sum+=c-'0';
        }    
        boolean answer = true;
        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}