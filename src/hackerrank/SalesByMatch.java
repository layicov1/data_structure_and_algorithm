package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {
        public static int sockMerchant(int n, List<Integer> ar) {
            int count = 0;
            Collections.sort(ar);
            for (int i = 0; i < ar.size()-1; i++) {
                if(ar.get(i)==ar.get(i+1)){
                    count++;
                    i++;
                }
            }
            return count;
        }
}
