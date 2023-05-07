package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int a = height.size();
        int max = 0;
        int b = 0;
        for (int j = 0; j < a; j++) {
            if (height.get(j) > max) {
                max = height.get(j);
            }
        }
       if(k>=max){
           return 0;
       }else{
           return max-k;
       }
    }
}

