package hackerrank.UnSolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(3);
        a.add(3);
        a.add(1);
        System.out.println(pickingNumbers(a));
    }
    public static int pickingNumbers(List<Integer> a) {
        int max = 0;
        Collections.sort(a);
        for (int i = 0; i <a.size()-1; i++) {
            int count = 0;
            for (int j = 1; j <a.size() ; j++) {
                if(Math.abs(a.get(i)-a.get(j))<2){
                    count++;
                }

            }
            if(count>=max){
                max=count;
            }
        }
        return max;
    }
}
