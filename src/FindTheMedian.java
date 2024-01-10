import java.util.Collections;
import java.util.List;
/*
* [Mock test]
* The median of a list of numbers is essentially its middle element after sorting.
* The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median.
*
* Example:
* arr = [5,3,1,2,4]
* The sorted array arr' = [1,2,3,4,5], The middle element and median is 3.
* */
public class FindTheMedian {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);

        return arr.get(arr.size()/2);
    }
    public static void main(String[] args) {
        System.out.println(findMedian(Util.formatString("0 1 2 4 6 5 3", ' ')));
    }
}
