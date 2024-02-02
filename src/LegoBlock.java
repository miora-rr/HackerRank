import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Java code inspired by https://medium.com/geekculture/understand-hackerrank-lego-blocks-bca16e1dc065
// Python code works
// Does not pass all test cases
public class LegoBlock {
    public static int legoBlocks(int height, int width) {
        int MOD = 1_000_000_007;
        // n combinations to build a single row
        List<Integer> rowCombinations = new ArrayList(Arrays.asList(1, 1, 2, 4));

        while (rowCombinations.size() <= width) {
            int sum = rowCombinations.subList(rowCombinations.size() - 4, rowCombinations.size())
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum() % MOD;
            rowCombinations.add(sum);
        }


        List<Integer> totalCombinations = rowCombinations
                .stream()
                .map(e -> (int) (Math.pow(e, height) % MOD))
                .collect(Collectors.toList());

        List<Integer> unstable = new ArrayList<>(Arrays.asList(0, 0));
        for (int i = 2; i < width + 1; i++) {
            int finalI = i;
            int result = IntStream.range(1, i)
                    .map(j -> (totalCombinations.get(j) - unstable.get(j)) * totalCombinations.get(finalI - j))
                    .sum();
            unstable.add(result % MOD);
        }

        return ((totalCombinations.get(width) - unstable.get(width)) % MOD);
    }



    public static void main(String[] args) {
        System.out.println(legoBlocks(2,2));
        System.out.println(legoBlocks(3,2));
        System.out.println(legoBlocks(3,2));
        System.out.println(legoBlocks(4,4));
//        legoBlocks(2,2);
//        legoBlocks(3,2);
//        legoBlocks(2,3);
//        legoBlocks(4,4);
    }
}
