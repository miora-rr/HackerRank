import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// Pass all tests even those with execution time constraints pass
public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranking = new ArrayList<>();
        Integer[] arr = ranked.stream()
                .distinct()
                .collect(Collectors.toList())
                .toArray(new Integer[0]);
        int firstElement = arr[0];
        int lastElement = arr[arr.length-1];

        for (Integer score : player) {
            if (score < lastElement) {
                ranking.add(arr.length+1);
                continue;
            }
            if (score >= firstElement){
                ranking.add(1);
                continue;
            }

            int index = Arrays.binarySearch(arr, score, Comparator.reverseOrder());
            if (index >= 0) {
                ranking.add(index+1);
            } else {
                int insertionPoint = -1*(index);
                ranking.add(insertionPoint);
            }
        }

        return ranking;
    }

    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(Util.formatString("100 90 90 80 75 60"), Util.formatString("50 65 77 90 102")));
    }
}
