import java.util.Arrays;
import java.util.List;

public class FlippingMatrix {
    /*
    * [MOCK TEST]
    * Sean invented a game involving a 2n x 2n matrix where each cell of the matrix contains an integer. He
    can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum
    of the elements in the n x n submatrix located in the upper-left quadrant of the matrix.
    *
    Given the initial configurations for matrices, help Sean reverse the rows and columns of each matrix in the
    best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal.
    *
    * Example
    * matrix = [[1,2],
    *           [3,4]]
    * It is a 2x2 and we want to maximize the top left quadrant, a 1x1 matrix. Reverse row 1:
    * matrix = [[1,2],
    *           [4,3]]
    * And now reverse column 0:
    * matrix = [[4,2],
    *           [1,3]]
    * The maximum sum is 4.
    *
    * My solution using a n = 2 matrix:
    * The original matrix will then be a 4x4 matrix.
    * Considering that we can only flip by columns and by rows.
    * Let's take the upper-left submatrix (the one we want to maximize) and replace the values to a, b, c,d.
    * Then we flip our matrix to see where those letters will appear in the other quadrants. The result will be:
    * matrix = [
    * a b b a
    * c d d c
    * c d d c
    * a b b a
    * ]
    * For each letter we add the max-value to the maxSum.
    */
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size()/2;
        int maxSum = 0;

        for (int i=0; i< n; i++){
            for (int j=0; j<n; j++){
                List<Integer> row1 = matrix.get(i);
                List<Integer> row2 = matrix.get(2*n-i-1);

                maxSum += Arrays.asList(
                                row1.get(j),
                                row2.get(j),
                                row1.get(2*n-1-j),
                                row2.get(2*n-1-j)
                        ).stream().mapToInt(Integer::intValue)
                        .max()
                        .getAsInt();
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println(flippingMatrix(Arrays.asList(
                Util.formatString("112 42 83 119", ' '),
                Util.formatString("56 125 56 49", ' '),
                Util.formatString("15 78 101 43", ' '),
                Util.formatString("62 98 114 108", ' ')))
        );
    }


}
