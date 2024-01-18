public class Anagram {
    public static int anagram(String s) {
        int len = s.length()/2;
        int count = 0;
        String s1 = s.substring(0, len);
        String s2 = s.substring(len,s.length());
        char[] s1Chars = s1.toCharArray();

        if (s.length()%2!=0) return -1;
        for (char c : s1Chars){
            int index = s2.indexOf(c);
            if (index == -1) count++;
            else {
                s2 = s2.substring(0, index) + s2.substring(index+1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(anagram("xaxbbbxx"));
        System.out.println(anagram("mnop"));
    }
}
