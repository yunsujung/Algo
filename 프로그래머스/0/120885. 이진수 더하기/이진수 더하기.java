class Solution {
    public String solution(String bin1, String bin2) {
        int maxLen = Math.max(bin1.length(), bin2.length());
        int[] result = new int[maxLen + 1];

        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int k = maxLen;

        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? bin1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? bin2.charAt(j) - '0' : 0;
            result[k] += bit1 + bit2;

            if (result[k] >= 2) {
                result[k] -= 2;
                result[k - 1] += 1;
            }

            i--;
            j--;
            k--;
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        for (int idx = 0; idx < result.length; idx++) {
            if (leadingZero && result[idx] == 0) {
                continue;
            }
            leadingZero = false;
            sb.append(result[idx]);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
