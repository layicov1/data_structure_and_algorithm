package hackerrank;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if((i<j&& (ar.get(i)+ar.get(j))%k==0)){
                    count++;
                }
            }
        }
        return count;
    }
}
