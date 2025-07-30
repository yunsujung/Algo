class Solution {
    public String solution(String[] seoul) {
        String one = "김서방은 ";
        int x = 0;
        String two = "에 있다";
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x=i;
            }
        }
        return one+x+two;
    }
}