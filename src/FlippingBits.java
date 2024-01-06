import java.util.Arrays;
import java.util.stream.Collectors;
/*
* You will be given a list of 32 bit unsigned integers. Flip all the bits ( 1->0 and 0->1 ) and return the result as an unsigned integer.
* Example
* n = 9 (dec) = 1001 (bin). Working with 32 bits, so
* 00000000000000000000000000001001 = 9
* 11111111111111111111111111110110 = 4294967286
* */
public class FlippingBits {
    public static long flippingBits(long n) {
        String paddedBinary = String.format("%32s", Long.toBinaryString(n)).replace(' ', '0'); // Using Long.toBinaryString will not add the leading zeros.
        String invertedBinary = Arrays.stream(paddedBinary
                        .split(""))
                .map(bit -> String.valueOf(Integer.parseInt(bit) ^ 1))
                .collect(Collectors.joining());

        return Long.parseLong(invertedBinary, 2);
    }
    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
        System.out.println(flippingBits(1));
        System.out.println(flippingBits(0));
        System.out.println(flippingBits(9));
    }
}
