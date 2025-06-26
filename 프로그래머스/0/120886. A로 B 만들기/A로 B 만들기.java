import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char [] beStr= new char [before.length()];
        char [] afStr=new char [after.length()];
        
        for(int i=0; i<before.length(); i++){
            beStr[i] = before.charAt(i);
            afStr[i] = after.charAt(i);    
        }
        
        Arrays.sort(beStr);
        Arrays.sort(afStr);
        
        if(Arrays.equals(beStr,afStr)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}