import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..", 
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};

        Map<String, String> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], String.valueOf((char)('a' + i)));
        }

        StringBuilder answer = new StringBuilder();
        for (String code : letter.split(" ")) {
            answer.append(morseMap.get(code));
        }

        return answer.toString();
    }
}
