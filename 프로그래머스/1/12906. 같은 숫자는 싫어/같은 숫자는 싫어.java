import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        if(arr.length==0) return new int[0];
        
        int cnt=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                cnt++;
            }
        }
        
        
        int[] answer = new int[cnt];
        int w = 0;
        answer[w++]=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                answer[w++] = arr[i];
            }
        }

        return answer;
    }
}