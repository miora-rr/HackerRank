import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        AtomicInteger pairs = new AtomicInteger(0);

        Map<Integer, Long> frequencyMap = ar.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyMap.forEach((k,v) -> pairs.addAndGet((int) (v / 2)));

        return pairs.get();
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}
