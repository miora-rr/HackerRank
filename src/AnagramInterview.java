import java.util.HashMap;

// Not from HackerRank. I had an interview about Anagram and I wanted reflect on the solutions in a non-interview environment.
// The second solution is way faster!
public class AnagramInterview {
    // Solution 1 : use Maps
    public static Boolean isAnagram (String word1, String word2){
        HashMap<Character, Integer> letterOccurence1 = new HashMap<>();
        HashMap<Character, Integer> letterOccurence2 = new HashMap<>();

        for (char letter : word1.toCharArray()) {
            letterOccurence1.put(letter, letterOccurence1.getOrDefault(letter, 0) + 1);
        }

        for (char letter : word2.toCharArray()) {
            letterOccurence2.put(letter, letterOccurence2.getOrDefault(letter, 0) + 1);
        }

        return letterOccurence1.equals(letterOccurence2);
    }

    // Solution2: Delete each letter if second word contains the letter in first word
    public static Boolean isAnagram2(String word1, String word2){
        StringBuilder secondWord = new StringBuilder(word2);

        for (char letter : word1.toCharArray()) {
            int letterPos = secondWord.indexOf(String.valueOf(letter));
            if (letterPos != -1){ secondWord.deleteCharAt(letterPos);}
            else return false;
        }

        return true;
    }
    public static void main(String[] args) {
        // Test First method
        long startTime = System.nanoTime();
        System.out.println(isAnagram("life", "file"));
        System.out.println(isAnagram("bored", "robed"));
        System.out.println(isAnagram("mio", "nio"));
        long endTime = System.nanoTime();
        long duration1 = endTime - startTime;
        System.out.println("Execution time for first solution: " + duration1 + " nanoseconds\n");

        // Test Second method
        startTime = System.nanoTime();
        System.out.println(isAnagram2("life", "file"));
        System.out.println(isAnagram2("bored", "robed"));
        System.out.println(isAnagram2("mio", "nio"));
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;
        System.out.println("Execution time for second solution: " + duration2 + " nanoseconds");
    }
}
