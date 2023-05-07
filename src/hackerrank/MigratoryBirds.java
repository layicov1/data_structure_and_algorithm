package hackerrank;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(int arr[]) {
        int num1=0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five  = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==1){
                one++;
            }else if(arr[index]==2){
                two++;
            }else if(arr[index]==3){
                three++;
            }else if(arr[index]==4){
                four++;
            }else if(arr[index]==5){
                five++;
            }
        }
        int[] num = new int[]{one,two,three,four,five};
        for (int num2 : num) {
            if(num1<num2){
                num1=num2;
            }
        }
        int index = 0;
        for (int i = 0; i <num.length ; i++) {
            index++;
            if(num[i]==num1){
                System.out.println(index);
                break;
            }
        }
        return index+1;
    }
}
