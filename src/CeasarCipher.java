public class CeasarCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder cipher = new StringBuilder();
        char[] str = s.toCharArray();

        for (char c : str) {
            if (Character.isAlphabetic(c)) {
                if (c >= 'a') {
                    int alphaPos = c - 'a';
                    int newAlphaPos = (alphaPos + k) % 26;
                    cipher.append((char) ('a' + newAlphaPos));
                } else {
                    int alphaPos = c - 'A';
                    int newAlphaPos = (alphaPos + k) % 26;
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
