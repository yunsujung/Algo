class Solution {
    public int[] solution(int n, int m) {
        int g = gcd(n, m);         // 최대공약수
        long l = (long) n / g * m; // 최소공배수 (long으로 계산)
        return new int[]{ g, (int) l };
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
