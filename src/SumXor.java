public class SumXor {
    public static long sumXor(long n) {
        /*
        * Naive solution :
        * return n != 0 ? LongStream.range(0, n)
                        .filter(i-> (n+i) == (n^i))
                        .count()
                        : 0;
        */
        if (n == 0) return 1;

        Long nZerosBinaryForm = Long.toBinaryString(n)
                .chars()
                .filter(c -> c=='0')
                .count();

        return (long) Math.pow(2, nZerosBinaryForm);
    }

    public static void main(String[] args) {
        System.out.println(sumXor(0));
    }
}
