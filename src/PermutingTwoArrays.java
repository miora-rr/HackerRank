import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/*
* There are two n-element arrays of integers, A and B. Permute them into some A' and B' such that the relation A'[i]+B'[i]>=k holds for all i where 0<=i<n .

There will be q queries consisting of A, B, and k. For each query, return YES if some permutation ,  A', B' satisfying the relation exists. Otherwise, return NO.

Example
A = [0,1]
B = [0,2]
k = 1

A valid A', B' is A'=[0,1] and B'=[0,2] : 1+0>= 1 and 0+2>=1. Return YES.
* */
public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Idea : by sorting the arrays, we can match all the lowest possible from A with highset possible from B
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        return IntStream.range(0, A.size()).allMatch(i -> A.get(i) + B.get(i) >= k) ? "YES" : "NO";
    }
    public static void main(String[] args) {
        System.out.println(twoArrays(10, Arrays.asList(2,1,3), Arrays.asList(7,8,9)));
        System.out.println(twoArrays(5, Arrays.asList(1,2,2,1), Arrays.asList(3,3,3,4)));
    }
}
