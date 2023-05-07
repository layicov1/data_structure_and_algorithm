package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;
        int c = 0;
        for (int i = 0; i <s.size()-m+1 ; i++) {
            c=0;
            sum = 0;
            while(m>c){
                sum = sum+s.get(i+c);
                c++;
            }
            if(sum==d){
                count++;
            }
        }
        return count;
    }
}
