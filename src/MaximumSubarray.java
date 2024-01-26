import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumSubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSum = 0;
        boolean allLessThanZero = arr.stream().allMatch(num -> num < 0);

        if (allLessThanZero) {
            Collections.sort(arr, Collections.reverseOrder());
            System.out.println(arr);
            maxSum = arr.get(0);
        } else {
            maxSum = arr.stream().filter(e -> e>0).mapToInt(Integer::intValue).sum();
        }

        return Arrays.asList(kadaneAlgorithm(arr), maxSum);
    }

    // Not my code
    public static int kadaneAlgorithm(List<Integer> arr) {
        int size = arr.size();
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + arr.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }

        return max_so_far;
    }
}
