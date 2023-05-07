package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(4);
        ans.add(4);
        ans.add(2);
        ans.add(2);
        ans.add(8);
        System.out.println(cutTheSticks(ans));

    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        boolean flag = true;
        ans.add(arr.size());
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            for (Integer a : arr) {
                if (arr.get(i) < a) {
                    count++;
                }
            }
            for (int j = 0; j < ans.size(); j++) {
                if (ans.get(j) != count) {
                    flag = false;
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag != true) {
                if (count == 0) {
                    break;
                } else {
                    ans.add(count);
                }

            }
        }
        return ans;
    }
}
