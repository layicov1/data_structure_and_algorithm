package hackerrank;

import java.awt.*;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int height = 0;
        for (int i = 0; i <path.length() ; i++) {
            if(path.charAt(i)=='U'){
                height++;
                if(height==0){
                    valleys++;
                }
            } else{
                height--;
            }
        }
        return valleys;
    }

}
