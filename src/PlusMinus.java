
import java.util.Arrays;
import java.util.List;

//Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positive=0, negative=0, zero =0;
        for (int number: arr){
            if (number <0) negative++;
            else if (number>0) positive++;
            else zero++;
        }

        double positiveRatio = (double) positive/arr.size();
        double negativeRatio = (double) negative/arr.size();
        double zeroRatio = (double) zero/arr.size();
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);

    }

    public static void main(String[] args) {
        plusMinus(Arrays.asList(-4,3,-9,0,4,1));

    }
}