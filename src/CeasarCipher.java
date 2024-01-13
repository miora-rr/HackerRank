public class CeasarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder cipher = new StringBuilder();
        char[] str = s.toCharArray();

        for (char c : str) {
            if (Character.isAlphabetic(c)) {
                if (c >= 'a') {
                    int aplahabetPos = c - 'a';
                    int newAlphaPos = (aplahabetPos + k) % 26;
                    cipher.append((char) ('a' + newAlphaPos));
                } else {
                    int aplahabetPos = c - 'A';
                    int newAlphaPos = (aplahabetPos + k) % 26;
                    cipher.append((char) ('A' + newAlphaPos));
                }
            } else {
                cipher.append(c);
            }
        }

        return cipher.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }
}
