import java.util.*;
public class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); // <Cost, id>
        for (int i=0; i< arr.size(); i++) {
            int id = i+1;
            int cost = arr.get(i);
            int balance = m-cost;

            if(map.containsKey(balance)) {
                return Arrays.asList(map.get(balance), id);
            }

            map.putIfAbsent(cost, id);
        }

        // Won't happen bc there will always be a solution
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(icecreamParlor(5, Util.formatString("1 4 5 3 2 ")));
    }
}
