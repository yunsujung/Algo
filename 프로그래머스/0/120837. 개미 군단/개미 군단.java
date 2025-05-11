class Solution {
    public int solution(int hp) {
        int answer = 0;
        int five = 5;
        int three = 3;
        int one = 1;
        
        if(hp>=five){
            answer += hp/five;
            answer += hp%five/three;
            answer += hp%five%three;
        }else if(hp>=three){
            answer += hp/three;
            answer += hp%three;
        }else{
            answer=hp;
        }
        return answer;
    }
}