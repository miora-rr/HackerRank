public class Palindrome {
    //Note 13/15 test cases work
    public static boolean isPalindrome (char[] s, int l, int r){
        if (s==null || l > r) return false;
        while (l < r) {
            if (s[l] != s[r]) return false;
            l++;
            r--;
        }

        return true;
    }
    public static int palindromeIndex(String s) {
        if (s == null || s.length() < 2) return -1;
        char[] ss = s.toCharArray();
        int l = 0, r = ss.length - 1;

        if (isPalindrome(ss, l, r)) return -1;
        while (l < r) {
            if (isPalindrome(ss, l + 1, r)) return l;
            if (isPalindrome(ss, l, r - 1)) return r;
            if (ss[l] != ss[r]) return -1;
            l++;
            r--;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("baa"));
    }
}
