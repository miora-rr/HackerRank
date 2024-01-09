import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {
    public static List<Integer> formatString (String numbersArray, char target){
        return Stream.of(numbersArray.split(String.valueOf(target)))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
