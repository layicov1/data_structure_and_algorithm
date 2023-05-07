package hackerrank.UnSolved;

import java.util.List;

public class EqualizeTheArray {
    public static void main(String[] args) {
        System.out.println(equalizeArray(List.of(3, 3, 1, 2, 3)));
    }
    public static int equalizeArray(List<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            int count = 1;
            for (int j = 1; j <arr.size() ; j++) {
                if(arr.get(i)==arr.get(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
        return arr.size()-max;
    }
}
