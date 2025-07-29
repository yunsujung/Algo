import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                cnt++;
            }
        }
        if(cnt==0){
            cnt=1;
        }
        
        int start=0;
        int[] answer = new int[cnt];
        
        answer[0]=-1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer[start++]=arr[i];
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}