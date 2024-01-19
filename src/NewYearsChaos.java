import java.util.Arrays;
import java.util.List;

//Solution from https://stackoverflow.com/questions/53543089/new-year-chaos-hackerrank-practise-problem-c-sharp-solution-optimization
public class NewYearsChaos {
    public static void minimumBribes(List<Integer> q) {
        int nBribe = 0;
        boolean isChaotic = false;
        for(int i=0; i<q.size(); i++){
            if(q.get(i) - (i+1) > 2) {
                isChaotic = true;
                break;
            }
            for (int j = Math.max(0, q.get(i)-2); j<i; j++ ){
                if(q.get(j) > q.get(i)) nBribe++;
            }
        }
        if (isChaotic) System.out.println("Too chaotic");
        else System.out.println(nBribe);
    }

    public static void main(String[] args) {
        minimumBribes(Arrays.asList(2,5,1,3,4));
    }
}
