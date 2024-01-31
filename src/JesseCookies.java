import java.util.List;
import java.util.PriorityQueue;

public class JesseCookies {
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> myCookies = new PriorityQueue<>(A);
        int nIteration = 0;

        while (myCookies.size()>= 2 && myCookies.peek() < k){
            myCookies.add(myCookies.poll() + myCookies.poll()*2);
            nIteration++;
        }

        return myCookies.peek() < k ? -1 : nIteration;
    }

    public static void main(String[] args) {
        System.out.println(cookies(7, Util.formatString("1 2 3 9 10 12")));
    }
}
