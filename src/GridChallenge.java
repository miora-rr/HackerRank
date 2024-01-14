import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        // Sort each line of the rows in alphabetic order
        List<String> sortedGrid = grid.stream()
                .map(row -> row.chars()
                        .mapToObj(c -> (char) c)
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());

        int nRows = sortedGrid.size();
        int nColumns = sortedGrid.get(0).length();

        // Check if all columns are in alphabetic order
        return  IntStream.range(0, nColumns)
                .allMatch(col ->
                        IntStream.range(0, nRows - 1)
                                .allMatch(row -> sortedGrid.get(row).charAt(col) <= sortedGrid.get(row + 1).charAt(col)))
                ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(gridChallenge(Arrays.asList("kc", "iu")));
    }
}
