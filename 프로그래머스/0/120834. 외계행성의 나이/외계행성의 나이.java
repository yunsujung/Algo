import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        
        for(int i=0; i<ageStr.length(); i++){
            char digit = ageStr.charAt(i);
            char converted = (char)('a'+(digit-'0'));
            answer += converted;
        }
        return answer;
    }
}