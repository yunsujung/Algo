import java.util.*;

class Solution {
    public String solution(String s) {
        /*
        알파벳 배열 int로 만들고
        문자열 문자로 바꾼다음에 
        해당하는문자 알파벳 배열 카운트 해줌.
        그리고 배열 값이 1인 것만 answer에 추가해줌.append? stringBuilder로?
        */
        int [] count = new int[26];
        
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }
        return answer.toString();
    }
}