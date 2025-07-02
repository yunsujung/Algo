class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0; i<array.length; i++){
        str += array[i];
}
        
        for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);
            if(c=='7'){
answer++;
}
}
        return answer;
    }
}