import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
Given an array of integers, where all elements but one occur twice, find the unique element.
Example
a = [1,2,3,4,3,2,1]
The unique element is 4
 */
public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyInteger(Arrays.asList(1,2,3,4,3,2,1)));
    }

    public static int lonelyInteger(List<Integer> a) {
        return a.stream()
                .filter(e -> Collections.frequency(a, e) == 1)
                .collect(Collectors.toList())
                .get(0);
    }
}
