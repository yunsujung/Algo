class Solution {
    public int solution(int n) {
        int answer = 1000000;
        for(int i=1; i<=n; i++){
            if(n%i==1&&i<answer){
                answer=i;
            }
        }
        return answer;
    }
}