package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int amax = 0;
        int bmin = Integer.MAX_VALUE;
        int count = 0;
        List<Integer> divide = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > amax) {
                amax = a.get(i);
            }
        }
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < bmin) {
                bmin = b.get(i);
            }
        }
        int count1 = 0;
        for (int i = amax; i <= bmin; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (i % a.get(j) == 0) {
                    count1++;
                }else{
                    count1=0;
                }
            }
            if(count1==a.size()){
                divide.add(i);
            }else{
                count1=0;
            }
        }
        int count2 = 0;
        for (int j = 0; j < divide.size(); j++) {
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) % divide.get(j) == 0) {
                    count2++;
                }
                else{
                    count2=0;
                }
            }
            if (count2 == b.size()) {
                count++;
                count2=0;
            }else{
                count2=0;
            }
        }
        return count;
    }
}
