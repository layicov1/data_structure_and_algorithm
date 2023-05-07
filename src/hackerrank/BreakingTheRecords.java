package hackerrank;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> count = new ArrayList<>();
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        min.add(scores.get(0));
        max.add(scores.get(0));
        int minInt = min.get(0);
        int maxInt = max.get(0);
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i <scores.size() ; i++) {
            if(maxInt<scores.get(i)){
                maxCount++;
                maxInt = scores.get(i);

            }
            if(minInt>scores.get(i)){
                minCount++;
                minInt = scores.get(i);
            }
        }
        count.add(maxCount);
        count.add(minCount);
        return count;
    }
}
