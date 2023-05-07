package hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12))));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int oneSum = 0 ;
        int twoSum = 0;
        for (int i = 0 , j = 0; i <arr.size() ; j++,i++) {
            oneSum = oneSum+arr.get(i).get(j);
        }
        for (int i = 0 , j = arr.size()-1;j>=0 ; j--,i++) {
            twoSum = twoSum+arr.get(i).get(j);
        }
        return Math.abs(twoSum-oneSum);
    }
}
