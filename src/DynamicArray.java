import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> answers = new ArrayList<>();
        List<List<Integer>> arr = IntStream.range(0, n)
                .mapToObj(i -> new ArrayList<Integer>())
                .collect(Collectors.toList());
        int lastAnswer = 0;

        for (List<Integer> line : queries){
            int x = line.get(1);
            int y = line.get(2);
            int idx = (x^lastAnswer)%n;

            if (line.get(0) == 1){
                arr.get(idx).add(y);
            } else {
                lastAnswer = arr.get(idx).get(y%arr.get(idx).size());
                answers.add(lastAnswer);
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
                Util.formatString("1 0 5"),
                Util.formatString("1 1 7"),
                Util.formatString("1 0 3"),
                Util.formatString("2 1 0"),
                Util.formatString("2 1 1")
        ));
        List<Integer> answers = dynamicArray(2, arr);
        System.out.println(answers);
    }
}
