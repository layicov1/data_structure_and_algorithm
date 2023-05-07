package hackerrank;

import java.util.List;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) - arr.get(i) == d) {
                    for (int k = 0; k <arr.size(); k++) {
                        if(arr.get(k)-arr.get(j)==d){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
