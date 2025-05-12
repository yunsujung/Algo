import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if('0'<=ch && ch<='9'){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if('0'<=ch && ch<='9'){
                answer[index++] += ch -'0';
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}