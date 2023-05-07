package hackerrank.UnSolved;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] list  = new int[100];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            list[arr.get(i)]++;
        }
        for (int i = 0; i < list.length ; i++) {
            result.add(list[i]);
        }
        return result;
    }

}
