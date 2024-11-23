public class Leet686RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        int l1, l2, n = 1, i = 0, j = 0;
        l1 = a.length();
        l2 = b.length();
        int k = ffc(0, l1, a, b);
        j = k;
        if (j == -1)
            return -1;
        for (i = 0; i < l2; i++) {
            if (b.charAt(i) == a.charAt(j)) {
                if (j == (l1 - 1)) {
                    j = 0;
                    if (i == (l2 - 1)) {
                    } else
                        n++;
                } else
                    j++;
            } else {
               // if (k < l1) { k would never exceed l1,therefore this condn will never hold true
                    n = 1;
                    j = ffc(++k, l1, a, b);
                    k=j;
                    if (j == -1) {
                        return -1;
                    }
                    i = -1;
            }
        }
        return n;
    }

    public static int ffc(int i, int l1, String a, String b) {
        // finding the position of first character of b in a
        int j;
        for (j = i; j < l1; j++) {
            if (a.charAt(j) == b.charAt(0))
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + repeatedStringMatch("abcabcabcabc", "abac"));
    }
}
