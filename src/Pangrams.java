import java.util.stream.IntStream;
/*
* A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
* Example
* s = 'The quick brown fox jumps over the lazy dog'
* The string contains all letters in the English alphabet, so return pangram.
* Constraints :
* 0 < length of s <= 10^3
* Each character of s, s[i] element of {a-z, A-Z, space)
* */
public class Pangrams {

    public static String pangrams(String s) {
        boolean[] alphabet = new boolean [26];

        for (char letter : s.toLowerCase().toCharArray()) {
            if (letter != (int) ' ') alphabet[letter - 'a'] = true;
        }

        return IntStream.range(0, alphabet.length).allMatch(i -> alphabet[i] == true) ? "pangram" : "not pangram";
    }
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
