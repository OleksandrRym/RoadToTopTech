package leetcode.daily;

public class CountTriples {
    public int countTriples(int n) {
        var conter = 0;
        var c = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                c = (int) Math.sqrt(a * a + b * b + 1.0);
                if (c <= n && c * c == a * a + b * b) conter++;
            }
        }
        return conter;
    }
}
