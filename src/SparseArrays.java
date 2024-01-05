import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
* There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
* Example
* strings = ['ab', 'ab', 'anc']
* queries = ['ab', 'abc', 'bc]
There are 2 instances of 'ab',1 of 'abc' and 0 of 'bc'. For each query, add an element to the return array, results [2,1,0] .
* */
public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        return queries.stream()
                .map(q -> Collections.frequency(strings, q))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(matchingStrings(Arrays.asList("aba", "baba", "aba", "xzxb"), Arrays.asList("aba","xzxb", "ab")).toString());
    }
}
