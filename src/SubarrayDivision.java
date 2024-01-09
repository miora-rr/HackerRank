import java.util.List;
import java.util.stream.IntStream;

/*
* Two children, Lily and Ron, want to share a chocolate har. Each of the squares has an integer on it
Lily decides to share a contiguous segment of the ber selected such that:
• The length of the segment matches Ron's birth month, and
• The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

* Example
s = (2.2, 1.3, 2)
d = 4
m = 2
Lily wants to find segments swimming to Ron's birthday i = 4 with a length equalling his birth month m = 2.
In this case there are two segments meeting her criteria. [2, 2] [1, 3]
* */
public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        if (s.size()==1) return 1;

        return (int) IntStream.range(0, s.size()+1-m)
                .map(i-> s.subList(i, i + m).stream().mapToInt(Integer::intValue).sum())
                .boxed()
                .filter(sum -> sum == d)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(birthday(Util.formatString("2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1", ' '), 18,7));
        System.out.println(birthday(Util.formatString("4 1 4 3 3 5 1 2 4 2 5 1 5 1 4 1 3 1 5 2 2 2 1 1 3 2 5 3 1 5 4 5 2 2 1 1 2 2 4 5 4 1 5 2 1 1 2 2 1 3 2 4 4 1 3 2 2 3 1 5 4 4 1 4 2 1 2 1 5 1 3 3 4 2 1 5 5 4 2 2 3 3 4 3 1 2 1 2 4 3", ' '), 16,7));
    }
}
