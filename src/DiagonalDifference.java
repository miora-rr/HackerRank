import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Given a square matrix, calculate the absolute difference between the sums of its diagonals.
* For example, the square matrix arr  is shown below:
* 1 2 3
* 4 5 6
* 9 8 9
* The left-to-right diagonal = 1+5+9=15 . The right to left diagonal = 3+5+9=17 . Their absolute difference is |15-17| = 2.
* */
public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primary = 0, secondary = 0;
        int k = arr.size() - 1;

        for (int i=0; i<arr.size(); i++) {
            primary += arr.get(i).get(i);
        }
        for (List<Integer> row : arr) {
            secondary += row.get(k--);
        }

        return Math.abs(primary-secondary);
    }
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<>(Arrays.asList(10, 8, -12)));
        System.out.println(diagonalDifference(arr));
    }
}
