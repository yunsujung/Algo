class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += (long)price*i;
        }
        if(money-sum<0){
            answer =(long) sum-money;
        }else if(money-sum>=0){
            answer = 0;
        }

        return answer;
    }
}