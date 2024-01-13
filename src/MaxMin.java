import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minUnfairness = arr.get(k-1) - arr.get(0); // first unfairness

        for (int i=0; i< arr.size()+1 -k; i++){
            List<Integer> sublist = arr.subList(i, i + k);
            int maxMin = sublist.get(k-1) - sublist.get(0);

            minUnfairness = Math.min(maxMin, minUnfairness);
        }

        return minUnfairness;
    }

    public static void main(String[] args) {
        System.out.println(maxMin(4,Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)));
    }
}
