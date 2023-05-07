package hackerrank;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        int length = arr.size();
        Collections.sort(arr);
        if(length%2==1){
            return arr.get(length/2);
        }else{
            int  count = (arr.get(length/2)+ arr.get(length/2+1))/2;
            return count;
        }
    }
}
