import java.util.*;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        int cnt=0;
      
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[cnt++] += i;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}