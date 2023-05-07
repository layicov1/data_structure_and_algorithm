package hackerrank;

import java.util.Arrays;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        int[] arr = new int[n];
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a = Integer.MAX_VALUE;
            for (int j = 0; j < c.length; j++) {
                if(Math.abs(i-c[j])<a){
                    a = Math.abs((i-c[j]));
                }
            }
            arr[i] = a;
        }
        int max = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}
