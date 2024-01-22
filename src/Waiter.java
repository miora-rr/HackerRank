import java.util.*;

public class Waiter {
    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> answers = new ArrayList<>();
        List<Integer> prime = getPrime(q);

        for (int i=0; i<q; i++){
            for (int j = 0; j< number.size(); j++){
                int val = number.get(j);
                if (val% prime.get(i) ==0) {
                    answers.add(val);
                    number.remove(j);
                    j--;
                }
            }
            Collections.reverse(number);
        }
        Collections.reverse(number);
        answers.addAll(number);

        return answers;
    }

    // Not my code
    public static List<Integer> getPrime(int number){
        List<Integer> prime = new ArrayList<>();
        int p = 2;
        while(prime.size()<number){
            boolean flag = false;
            for(int i=2; i<=Math.sqrt(p); i++) {
                if(p%i == 0) {
                    flag = !flag;
                    break;
                }
            }
            if(!flag) {
                prime.add(p);
            }
            p++;
        }

        return prime;
    }

    public static void main(String[] args) {
        System.out.println(waiter(Util.formatString("3 4 7 6 5"), 1));
    }
}
