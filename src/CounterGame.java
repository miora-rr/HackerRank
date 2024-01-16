public class CounterGame {
    public static String counterGame(long n) {
        boolean isLouiseTurn = true;
        Long counter = n;

        while (counter > 1) {
            Long nextLowerNumber = Long.highestOneBit(counter);
            Long subtract = counter-nextLowerNumber;

            counter = subtract != 0L ? subtract : (counter/2L);
            isLouiseTurn = !isLouiseTurn;
        }

        return isLouiseTurn ? "Richard" : "Louise";
    }

    public static void main(String[] args) {
        System.out.println(counterGame(1560834904));
        System.out.println(counterGame(1768820483));
        System.out.println(counterGame(1533726144));
        System.out.println(counterGame(1620434450));
        System.out.println(counterGame(1463674015));
    }
}
