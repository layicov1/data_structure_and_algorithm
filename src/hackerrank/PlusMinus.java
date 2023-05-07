package hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        int pozitive = 0;
        int negative = 0;
        int zero =0;
        for (int i = 0; i < size; i++) {
            if(arr.get(i)>0){
                pozitive++;
            } else if (arr.get(i)<0){
                negative++;
            }else{
                zero++;
            }
        }
        double p = (double) pozitive/size;
        double n = (double) negative/size;
        double z = (double) zero/size;


        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }

}
