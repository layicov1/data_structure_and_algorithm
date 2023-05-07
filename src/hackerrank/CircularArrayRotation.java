package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3);
        List<Integer> b = List.of(1,2);
        System.out.println(circularArrayRotation(a, 2, b));
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int count = 0;
        int[] arr = new int[a.size()];
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            arr[(i+k)%a.size()]=a.get(i);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < queries.size(); i++) {
            temp.add(arr[queries.get(i)]);
        }
        return temp;
    }
}
