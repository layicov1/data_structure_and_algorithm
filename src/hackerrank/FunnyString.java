package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {
    public static String funnyString(String s) {
        boolean flag = false;
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        for (int i = 0; i <s.length()-1 ; i++) {
            char i1 = s.charAt(i);
            char i2 = s.charAt(i+1);
            int  i3  = i1;
            int i4 = i2;
            temp.add(Math.abs(i3-i4));
        }
        for (int i = s.length()-1; i >=1 ; i--) {
            char i1 = s.charAt(i);
            char i2 = s.charAt(i-1);
            int  i3  = i1;
            int i4 = i2;
            temp1.add(Math.abs(i3-i4));
        }
        for (int r = 0; r < temp1.size(); r++) {
            if(temp.get(r)==temp1.get(r)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            return "Funny";
        }else{
            return "Not Funny";
        }
    }
}
