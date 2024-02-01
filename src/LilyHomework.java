import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Doesnt resolve all test case but a draft
// Inspired by: https://coding-gym.org/challenges/lilys-homework/#:~:text=Roughly%2C%20the%20idea%20consists%20in,with%20the%20%E2%80%9Cexpected%E2%80%9D%20one.
public class LilyHomework {
    public static int lilysHomework(List<Integer> arr) {
        List<Integer> sorted = arr.stream()
                .map(Integer::new)
                .collect(Collectors.toList());

        Collections.sort(sorted);

        int swaps = 0;
        Map<Integer, Integer> locations = IntStream.range(0, arr.size())
                .boxed()
                .collect(Collectors.toMap(arr::get, i -> i));
        for (int i=0; i<sorted.size();i++){
            if (sorted.get(i) != arr.get(i)){
                swaps++;
                int swapIdx = locations.get(sorted.get(i));
                locations.put(arr.get(i), swapIdx);
                System.out.println(locations);
                Collections.swap(arr, i, swapIdx);
            }
        }
        System.out.println(arr);
        return swaps;
    }

    public static void main(String[] args) {
        System.out.println(lilysHomework(Util.formatString("2 5 3 1")));
    }
}
