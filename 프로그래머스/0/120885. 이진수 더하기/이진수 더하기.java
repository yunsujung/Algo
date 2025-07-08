class Solution {
    public String solution(String bin1, String bin2) {
        // 더 긴 길이를 기준으로 배열 크기 설정
        int maxLen = Math.max(bin1.length(), bin2.length());
        int[] result = new int[maxLen + 1]; // 자리수 늘어날 수 있으므로 +1

        // 뒤에서부터 각 자리 더하기
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int k = maxLen;

        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? bin1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? bin2.charAt(j) - '0' : 0;
            result[k] += bit1 + bit2;

            // 자리수 옮기기 (carry 처리)
            if (result[k] >= 2) {
                result[k] -= 2;
                result[k - 1] += 1;
            }

            i--;
            j--;
            k--;
        }

        // 결과 배열 -> 문자열 변환
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int val : result) {
            if (leadingZero && val == 0) continue;
            leadingZero = false;
            sb.append(val);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
