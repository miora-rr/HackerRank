import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Deque<Integer> s1 = new ArrayDeque(h1);
        Deque<Integer> s2 = new ArrayDeque(h2);
        Deque<Integer> s3 = new ArrayDeque(h3);

        int h1Size = h1.stream().mapToInt(Integer::intValue).sum();
        int h2Size = h2.stream().mapToInt(Integer::intValue).sum();
        int h3Size = h3.stream().mapToInt(Integer::intValue).sum();

        while (true) {
            if (s1.peek() == null || s2.peek() == null || s3.peek() == null) return 0;
            if (h1Size == h2Size && h2Size == h3Size) return h1Size;

            if (h1Size >= h2Size && h1Size >= h3Size) h1Size -= s1.poll();
            else if (h2Size >= h1Size && h2Size >= h3Size) h2Size -= s2.poll();
            else if (h3Size >= h2Size && h3Size >= h1Size) h3Size -= s3.poll();
        }
    }
}
