package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int max = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            int count = Math.abs(arr.get(i) - arr.get(i+1));
            if (count < max) {
                max = count;
            }
        }
        System.out.println(max);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) - arr.get(j) == max) {
                    System.out.println(max);
                    result.add(arr.get(j));
                    result.add(arr.get(i));
                }
            }
        }
        return result;
    }

}
