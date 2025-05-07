import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        //set에다 모음 다 넣고
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        //for문으로 문자열 돌리면서 set에 해당되지 않으면 넣는거!
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(!vowels.contains(ch)){
                answer += ch;
            }
        }
        return answer;
    }
}