import java.util.List;

public class Hackerland {
    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        x.sort(null);

        int[] houses = x.stream().mapToInt(Integer::intValue).toArray();
        int transmitters = 0;
        int i = 0;

        while (i < houses.length) {
            transmitters++;
            int loc = houses[i] + k;

            // Move to the rightmost house within range
            while (i < houses.length && houses[i] <= loc) {
                i++;
            }

            // Move to the leftmost house outside range
            loc = houses[--i] + k;
            while (i < houses.length && houses[i] <= loc) {
                i++;
            }
        }

        return transmitters;
    }

    public static void main(String[] args) {
        System.out.println(hackerlandRadioTransmitters(Util.formatString("7 2 4 6 5 9 12 11"),2));
    }
}
