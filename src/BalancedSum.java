import java.util.List;
public class BalancedSum {
    public static String balancedSums(List<Integer> arr) {
        int total = arr.stream().mapToInt(Integer::intValue).sum();
        int leftSum = 0;
        for (Integer element : arr) {
            if (leftSum == total - element - leftSum) return "YES";
            leftSum += element;
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(balancedSums(Util.formatString("1 2 3 3")));
    }
}
