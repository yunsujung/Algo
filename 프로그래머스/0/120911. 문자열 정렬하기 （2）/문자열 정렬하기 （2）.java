import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        char [] chs = my_string.toCharArray();
        
        Arrays.sort(chs);
        
        String answer = new String(chs);
        return answer;
    }
}