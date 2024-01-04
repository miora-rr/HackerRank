import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
* */
public class MiniMax {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        Long sum = arr.stream().mapToLong(Integer::intValue).sum();

        System.out.printf("%d %d", sum - arr.get(arr.size() - 1), sum - arr.get(0));
    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1,3,5,7,9));
    }
}


