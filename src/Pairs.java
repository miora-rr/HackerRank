import java.util.List;
import java.util.Arrays;

// Week 3 Mock Test
public class Pairs {
    public static int pairs (int k, List<Integer> arr){
        int nPairs = 0;
        int[] sorted = arr.stream().mapToInt(Integer::intValue).sorted().toArray();
        for (int number : sorted) {
            int balanced = number - k;
            if (balanced>0){
                int indexBalanced = Arrays.binarySearch(sorted, balanced);
                if (indexBalanced >=0) nPairs++;
            }
        }

        return nPairs;
    }
}
