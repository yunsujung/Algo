import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr); 

        String sortedStr = new String(arr);
        String reversedStr = new StringBuilder(sortedStr).reverse().toString();
        
        return Long.parseLong(reversedStr);
    }
}
