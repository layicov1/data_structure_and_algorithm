package hackerrank.UnSolved;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort_Part1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(3);
        insertionSort1(5,arr);
    }
    public static void insertionSort1(int n, List<Integer> arr) {
        List<Integer> temp = new ArrayList<>();
        for (int i = arr.size()-1; i >=1 ; i--) {
            if(arr.get(i)>arr.get(i-1)){
                temp = arr;
                temp.remove(i);
                temp.add(i,arr.get(i-1));
                System.out.println(temp);
            }
        }
    }
}
