import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        Collections.sort(unsorted, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.length() != s2.length()) return s1.length() - s2.length();

                return s1.compareTo(s2);
            }
        });

        return unsorted;
    }
}
